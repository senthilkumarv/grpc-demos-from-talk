import com.thougtworks.domains.person.PersonRequest
import com.thougtworks.domains.person.PersonResponse
import com.thougtworks.services.person.PersonServiceGrpc
import io.grpc.ManagedChannelBuilder

fun main() {
    val channel = ManagedChannelBuilder.forTarget("localhost:5000")
        .usePlaintext()
        .build()

    val client = PersonServiceGrpc.newBlockingStub(channel)

    listOf(0, 1, 2).forEach {
        val response = client.fetchById(
            PersonRequest.newBuilder()
                .setId(it)
                .build()
        )
        when (response.resultCase) {
            PersonResponse.ResultCase.PERSON -> println("${response.person.firstName} ${response.person.lastName}")
            PersonResponse.ResultCase.ERROR -> println(response.error.reason)
            PersonResponse.ResultCase.RESULT_NOT_SET, null -> println("Bad Response")
        }
    }
}
