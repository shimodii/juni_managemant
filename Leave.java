public class Leave {

    public void student (int ID){
        //db.update
        //delete student's info(from current term table)
    }

    public void teacher (int ID, int duration){
        private int leaveDaysTeacher = /* db.tchr.days.id(ID) */;
        if((leaveDaysTeacher-duration)>0){
            leaveDaysTeacher-=duration;
            //db.update
        }
        else {
            //error exception
        }
    }
    public void employee (int ID, int duration){
        private int leaveDaysEmployee = /* db.emp.days.id(ID) */;
        if((leaveDaysEmployee-duration)>0){
            leaveDaysEmployee-=duration;
            //db.update
        }
        else {
            //error exception
        }
    }
}

