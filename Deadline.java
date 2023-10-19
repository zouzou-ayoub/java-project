package TD2;
import java.util.Calendar;
import java.util.Date;

public class Deadline implements IDealine  {
    private Date date; 

    public Deadline(int days){ //constructeur avec parametre 
        Calendar calendar = Calendar.getInstance(); 
        calendar.add(Calendar.DAY_OF_MONTH,days); // dans ce calendar en decale en nombre de jour 
        this.date= calendar.getTime() ; 
    }

    public Deadline(Date _date){ //constructeur avec parametre 
        this.date= _date ; 
    }

    @Override
    public boolean expired() { //definir 
        return date.before(new Date());
    }
}
