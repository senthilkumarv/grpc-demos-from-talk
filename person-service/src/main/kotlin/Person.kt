import com.kroger.domains.common.ErrorOuterClass.Error
import com.kroger.domains.person.PersonOuterClass
import com.kroger.domains.person.PersonResponseOuterClass
import com.kroger.domains.person.PhoneNumberOuterClass
import com.kroger.domains.person.PhoneTypeOuterClass

fun senthil(): PersonResponseOuterClass.PersonResponse {
    val phone = PhoneNumberOuterClass.PhoneNumber.newBuilder()
        .setNumber("4043983216")
        .setPhoneType(PhoneTypeOuterClass.PhoneType.MOBILE)
        .build()
    val person = PersonOuterClass.Person.newBuilder()
        .setId(1)
        .setFirstName("Senthil")
        .setLastName("Kumar")
        .addPhoneNumbers(phone)
        .setEmail("senthil.kumar3@kroger.com")
        .setActive(true)
    return PersonResponseOuterClass.PersonResponse.newBuilder()
        .setPerson(person)
        .build()
}

fun errorResponse(code: Int, reason: String) = PersonResponseOuterClass.PersonResponse.newBuilder()
    .setError(
        Error.newBuilder()
            .setCode(code)
            .setReason(reason)
    )
    .build()