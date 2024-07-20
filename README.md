# Bus-Reservation-System
Collection 

{
	"info": {
		"_postman_id": "57be269e-a0a7-4085-96d9-ae3f014d4362",
		"name": "Bus Reservation Collection",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "15235224"
	},
	"item": [
		{
			"name": "Get Available Seats",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"busNumber\":\"MP09 JK 5681\",\r\n    \"seats\":[\r\n        {\r\n            \"seatNumber\":7,\r\n            \"isAvailable\":true\r\n        },\r\n        {\r\n            \"seatNumber\":6,\r\n            \"isAvailable\":true\r\n        }\r\n\r\n    ]\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8082/2/seats",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8082",
					"path": [
						"2",
						"seats"
					]
				}
			},
			"response": []
		},
		{
			"name": "Get Routes",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"busNumber\":\"MP09 JK 5681\",\r\n    \"seats\":[\r\n        {\r\n            \"seatNumber\":7,\r\n            \"isAvailable\":true\r\n        },\r\n        {\r\n            \"seatNumber\":6,\r\n            \"isAvailable\":true\r\n        }\r\n\r\n    ]\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8082/routes",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8082",
					"path": [
						"routes"
					]
				}
			},
			"response": []
		},
		{
			"name": "Save Bus Details",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"busNumber\":\"MP09 JK 5681\",\r\n    \"seats\":[\r\n        {\r\n            \"seatNumber\":7,\r\n            \"isAvailable\":true\r\n        },\r\n        {\r\n            \"seatNumber\":6,\r\n            \"isAvailable\":true\r\n        }\r\n\r\n    ]\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8082/save/busDetails",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8082",
					"path": [
						"save",
						"busDetails"
					]
				}
			},
			"response": []
		},
		{
			"name": "Save Seat Details",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"busNumber\":\"MP09 JK 5681\",\r\n    \"seats\":[\r\n        {\r\n            \"seatNumber\":7,\r\n            \"isAvailable\":true\r\n        },\r\n        {\r\n            \"seatNumber\":6,\r\n            \"isAvailable\":true\r\n        }\r\n\r\n    ]\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8082/save/seatDetails",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8082",
					"path": [
						"save",
						"seatDetails"
					]
				}
			},
			"response": []
		},
		{
			"name": "Save Route Details",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"busNumber\":\"MP09 JK 5681\",\r\n    \"seats\":[\r\n        {\r\n            \"seatNumber\":7,\r\n            \"isAvailable\":true\r\n        },\r\n        {\r\n            \"seatNumber\":6,\r\n            \"isAvailable\":true\r\n        }\r\n\r\n    ]\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8082/save/routeDetails",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8082",
					"path": [
						"save",
						"routeDetails"
					]
				}
			},
			"response": []
		},
		{
			"name": "Get Bus Details by Id",
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\r\n    \"busNumber\":\"MP09 JK 5681\",\r\n    \"seats\":[\r\n        {\r\n            \"seatNumber\":7,\r\n            \"isAvailable\":true\r\n        },\r\n        {\r\n            \"seatNumber\":6,\r\n            \"isAvailable\":true\r\n        }\r\n\r\n    ]\r\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8082/get/busDetailsById/1",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8082",
					"path": [
						"get",
						"busDetailsById",
						"1"
					]
				}
			},
			"response": []
		}
	]
}
