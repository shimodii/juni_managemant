public class Financial {
    //loan part
    public class Loan {
        class Option {
            String[] opt=new String[5]={"10$-12M","15$-18M","20$-24M","25$-30M","30$-36m"};
            //time = (index + 2) * 6
            //quantity = (index + 2) * 5
            
            public int loanQuantity, loanDuration,paymentQuantity;
            paymentQuantity = loanQuantity / loanDuration;


            public void calculate(){
                for(int i=0;i<5;i++){
                    if( (i+1)*100 < /*emp or tchr.credit*/ ){
                        //opt[i].add.temp.loan.table => available
                    }
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
				//error
			}
            else{
                //db.tchr.balance.id(ID)-=option.quantity;
                //db.tchr.payDue.id(ID)=option.setDue;
                //db.tchr.loanTimes++;
            }
        }
        public void employee(int ID, int option){
            if(/*db.emp.credit<option.number)*/){
				//error
			}
            else{
				//db.emp.balance.id(ID)-=option.quantity;
				//db.emp.payDue.id(ID)=option.setDue;
			}
        }
    }
}
