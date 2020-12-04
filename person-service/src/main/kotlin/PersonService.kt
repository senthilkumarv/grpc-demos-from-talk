import com.kroger.domains.person.PersonRequestOuterClass
import com.kroger.domains.person.PersonResponseOuterClass
import com.kroger.services.person.PersonServiceGrpc
import io.grpc.stub.StreamObserver

class PersonService: PersonServiceGrpc.PersonServiceImplBase() {
    override fun fetchById(
        request: PersonRequestOuterClass.PersonRequest?,
        responseObserver: StreamObserver<PersonResponseOuterClass.PersonResponse>?) {
        val response = when (request?.id) {
            null, 0 -> errorResponse(400, "Request should have a valid id...")
            1 -> senthil()
            else -> errorResponse(404, "Invalid person id....")
        }
        responseObserver?.onNext(response)
        responseObserver?.onCompleted()
    }
}