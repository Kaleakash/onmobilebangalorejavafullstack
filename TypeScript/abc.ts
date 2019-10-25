interface Emp {
	id:number;
	name:string;
	salary:number;
}
let emp1:Emp = {"id":100,"name":"Ravi","salary":120000};

let emp2:Emp = {"id":100,"name":"Ravi"};

let emp3 = {"id":100};


console.log(emp1.id);
console.log(emp1.name);
console.log(emp1.salary);

/*interface Emp {
	id:number;
	name:string;
	salary:number;
	dis():void;
}
class EmpInfo implements Emp {
	id:number=100;	
	name:string="Ravi";
	salary:number=12000;
	dis() :void {
		console.log("dis function");
	}
}
let emp4 = new EmpInfo();

*/
