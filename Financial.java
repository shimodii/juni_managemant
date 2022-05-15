package com.sina;

public class Financial {
    //loan part
    public class Loan {
        class Option {
            public int[] options={100,200,300,400,500};
            public int loanQuantity, loanDuration,paymentQuantity;
            paymentQuantity = loanQuantity / loanDuration;


            public void calculate(){

                String[] availableOptions= new String[5];
                for(int i=0;i<5;i++){
                    if(options[i]</*emp or tchr.credit*/){

                    }
                }
//                    if(options[i]</*emp or tchr.credit*/){
//                        availableOptions[i]="Option"+i;
//                        System.out.println(availableOptions[i]);
//                        if(i==0){
//                            System.out.println("Quantity = 10 million Toman");
//                            System.out.println("Loan Duration = 12 months");
//                        }
//                        if(i==1){
//                            System.out.println("Quantity = 15 million Toman");
//                            System.out.println("Loan Duration = 18 months");
//                        }
//                        if(i==2){
//                            System.out.println("Quantity = 20 million Toman");
//                            System.out.println("Loan Duration = 24 months");
//                        }
//                        if(i==3){
//                            System.out.println("Quantity = 25 million Toman");
//                            System.out.println("Loan Duration = 30 months");
//                        }
//                        if(i==4){
//                            System.out.println("Quantity = 30 million Toman");
//                            System.out.println("Loan Duration = 36 months");
//                        }
//                    }
//                }
            }
        }
                }
        public void student(int ID, int option){
            if ( /* db.student.bedehi.id(ID) */ > 0 ){
                //error
            }else {
                //db.student.balance.id(ID)+=option.quantity;
                //db.student.payDue.id(ID)=option.setDue;
            }
        }
        int payTime (int ID){
            if (/*current time*/ == /* pay day */) {
                return 1;
            }
            return 0;
        }
        void checkLoan (int ID){
            if (payTime(ID)){
                //send sms
            }
        }
        public void teacher(int ID,int option){
            if(/*db.tchr.loanTimes.id(ID)>1)*/){
             //error}
            else{
                //db.tchr.balance.id(ID)-=option.quantity;
                //db.tchr.payDue.id(ID)=option.setDue;
                //db.tchr.loanTimes++;
            }

        }
        public void employee(int ID, int option){
            if(/*db.emp.credit<option.number)*/)
            //error
            else
            //db.emp.balance.id(ID)-=option.quantity;
            //db.emp.payDue.id(ID)=option.setDue;


        }
        }

    }
}