package CompanyAssignment.ShoppingTask;

import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;

class Dispatch {
    private LocalDate dispatchDate;
    private LocalDate estimatedDeliveryDate;

    public Dispatch() {
        this.dispatchDate = LocalDate.now();
        this.estimatedDeliveryDate = dispatchDate.plusDays(7);
    }
    public LocalDate getDispatchDate() {
        return dispatchDate;
    }

    public LocalDate getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }
}



