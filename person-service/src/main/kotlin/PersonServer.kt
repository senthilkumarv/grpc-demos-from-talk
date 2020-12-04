import io.grpc.ServerBuilder
import java.util.concurrent.TimeUnit

class PersonServer {
    fun start() {
        val server = ServerBuilder.forPort(5000)
            .addService(PersonService())
            .build()
            .start()
        Runtime.getRuntime()
            .addShutdownHook(object: Thread() {
                override fun run() {
                    server.shutdown().awaitTermination(5, TimeUnit.SECONDS)
                }
            })
        server.awaitTermination()
    }
}