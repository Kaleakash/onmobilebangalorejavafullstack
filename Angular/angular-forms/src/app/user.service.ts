import { Injectable } from '@angular/core';

@Injectable()
export class UserService {

    checkUser(formRef):string {
        if(formRef.user=="Ravi" && formRef.pass=="123"){
            
            return "Successfully Login!";
        }else {
            //console.log("Failure try once again!")
            return "Failure try once again!";
        }
    }
}