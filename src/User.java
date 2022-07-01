public class User {

    private String login;
    private String password;

    void createQuery() {
        Query query = new Query();
        query.printToLog();
    }
    class Query {
        void printToLog(){
        }
    }
}
