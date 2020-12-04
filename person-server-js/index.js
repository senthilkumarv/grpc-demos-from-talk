var messages = require('./generated/domains/person/person_request_pb');
var services = require('./generated/services/person/person.service_grpc_pb');

var grpc = require('grpc');

var client = new services.PersonServiceClient('localhost:5000', grpc.credentials.createInsecure());

[0, 1, 2].forEach(id => {
	var request = new messages.PersonRequest();
	request.setId(id);

	client.fetchById(request, (err, response) => {
		console.log("Result for id " + id);
		if (response.hasPerson()) {
			console.log(response.getPerson().getFirstName() + ' ' + response.getPerson().getLastName());
		} else {
			console.log(response.getError().getReason());
		}
	});	
});