var app = angular.module("iteration", []);

var projects = [
                {'projCode': 'EDU101', 'description': 'Multimedia', 'cost': 45000},
                {'projCode': 'EDU102', 'description': 'E-Tutor', 'cost': 65000},
                {'projCode': 'MED201', 'description': 'ECG', 'cost': 145000},
                {'projCode': 'MED202', 'description': 'CT-Scan', 'cost': 512000},
                {'projCode': 'ANI301', 'description': 'Ambulance', 'cost': 95000},
                ];

app.controller("projectController", function($scope){
	$scope.projectDetails = projects;

	$scope.clicker = function(){
				projects.push({'projCode': document.getElementById('projCode').value, 
					'description': document.getElementById('desc').value, 'cost': document.getElementById('cost').value});			
			}; 
	
}); 