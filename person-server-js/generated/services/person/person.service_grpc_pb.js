// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var domains_person_person_request_pb = require('../../domains/person/person_request_pb.js');
var domains_person_person_response_pb = require('../../domains/person/person_response_pb.js');

function serialize_domains_person_PersonRequest(arg) {
  if (!(arg instanceof domains_person_person_request_pb.PersonRequest)) {
    throw new Error('Expected argument of type domains.person.PersonRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_domains_person_PersonRequest(buffer_arg) {
  return domains_person_person_request_pb.PersonRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_domains_person_PersonResponse(arg) {
  if (!(arg instanceof domains_person_person_response_pb.PersonResponse)) {
    throw new Error('Expected argument of type domains.person.PersonResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_domains_person_PersonResponse(buffer_arg) {
  return domains_person_person_response_pb.PersonResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var PersonServiceService = exports.PersonServiceService = {
  fetchById: {
    path: '/services.person.PersonService/FetchById',
    requestStream: false,
    responseStream: false,
    requestType: domains_person_person_request_pb.PersonRequest,
    responseType: domains_person_person_response_pb.PersonResponse,
    requestSerialize: serialize_domains_person_PersonRequest,
    requestDeserialize: deserialize_domains_person_PersonRequest,
    responseSerialize: serialize_domains_person_PersonResponse,
    responseDeserialize: deserialize_domains_person_PersonResponse,
  },
};

exports.PersonServiceClient = grpc.makeGenericClientConstructor(PersonServiceService);
