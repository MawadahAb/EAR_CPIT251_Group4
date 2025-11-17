import java.util.Date;
import java.util.List;

public class Report {

     int reportID;
     Date date;
     Order order;
     Customer customer;
     Employee employee;
     Rating rating;

    public int totalOrdersByDate(Date date) {
        return 0;
    }

    public List generateReports(Date startDate, Date endDate) {
        return null;
    }

    public void viewReport(Date date) {
    }

    public int totalCustomersByDate(Date date) {
        return 0;
    }

    public int totalRatingsByDate(Date date) {
        return 0;
    }

    public List filterReportsByEmployee(int employeeID) {
        return null;
    }
}
