import javax.swing.JOptionPane;

public class l4q5 {
    
    public static void main(String[] args) {

        String inputDistance, inputHour, inputMinute, inputSecond, message;
        double distance,  totalSecond, meter_per_second, kilometers_per_hour, miles_per_hour;
        int hour, minute, second;
        
        inputDistance = JOptionPane.showInputDialog("Please enter distance value in meter");
        distance = Double.parseDouble(inputDistance);
        
        inputHour = JOptionPane.showInputDialog("Please enter time value in hour");
        hour = Integer.parseInt(inputHour);
        
        inputMinute = JOptionPane.showInputDialog("Please enter time value in minute");
        minute = Integer.parseInt(inputMinute);
        
        inputSecond = JOptionPane.showInputDialog("Please enter time value in second");
        second = Integer.parseInt(inputSecond);
        
        totalSecond = (hour * 3600) + (minute * 60) + second;
        
        meter_per_second = distance / totalSecond;
        miles_per_hour = (distance/1609) / (totalSecond/3600);
        kilometers_per_hour = (distance/1000) / (totalSecond/3600);
        
        message = String.format("meter per second: %.2f", meter_per_second) +
                  String.format("\nkilometers per hour : %.2f", kilometers_per_hour) +
                  String.format("\nmiles per hour : %.2f", miles_per_hour);
        
        JOptionPane.showMessageDialog(null, message);
    }
}
