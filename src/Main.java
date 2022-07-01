public class Main {
    public static void main(String[] args) {
    User user = new User();
    user.createQuery();

    User.Query query1 = user.new Query();
    query1.printToLog();

    User.Query query2 = new User().new Query();
    query2.printToLog();




    }
}