package Main.SystemDesign.LLD.BasicOops;

interface Notification {
    void send();
}
class EmailNotification implements Notification{
    @Override
     public void send(){
        System.out.println("Sending Email");
    }
}
class SMSNotification implements Notification{
    @Override
    public void send(){
        System.out.println("Sending SmsNotification");
    }
}
class NotificationServices{
    public static void main(String[] args) {
        public void notifyUser(Notification notification){
            notification.send();
        }
    }
}
