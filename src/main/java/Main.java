import java.io.IOException;

public class Main {
    private static String pathToFile = "C:\\Users\\Svitlana\\IdeaProjects\\goit-student-projects\\Multithreading" +
            "\\src\\main\\resources\\user\\";

    public static void main(String[] args) throws IOException, InterruptedException {
        InteractionWithJsonPlaceholder interaction = new InteractionWithJsonPlaceholder();
        //Create new user
        System.out.println("Created user:");
        System.out.println(interaction.createNewUser(createDefaultUser()));

        //Update user
        System.out.println("-----------------------");
        System.out.println("Updated user:");
        System.out.println(interaction.updateUser(1, createDefaultUser()));

        //Delete user by id
        System.out.println("-----------------------");
        System.out.println("Status of DELETE request: " + interaction.deleteUserById(2));

        //Information about all users
        System.out.println("-----------------------");
        System.out.println("Information about all users:");
        System.out.println(interaction.getUsers());

        //Information about user by id
        System.out.println("-----------------------");
        System.out.println("Information about user by id:");
        System.out.println(interaction.getUserById(4));

        //Information about user by username
        System.out.println("-----------------------");
        System.out.println("Information about user by username:");
        System.out.println(interaction.getUserByUsername("Leopoldo_Corkery"));

        //Get comments of last users post
        System.out.println("-----------------------");
        System.out.println("Get comments");
        System.out.println(interaction.getComments(1, pathToFile));

        //Get todos for user by id
        System.out.println("-----------------------");
        System.out.println("Todos:");
        System.out.println(interaction.getTodosForUser(4));
    }

    private static User createDefaultUser() {
        User newUser = new User.Builder()
                .id(1)
                .name("Svitlana")
                .username("Svitlana-94")
                .email("svitlana.yeremenko.94@gmail.com")
                .website("goit.ua")
                .phone("0669561807")
                .company(new Company.Builder()
                        .name("DMK E-Business")
                        .bs("some information")
                        .catchPhrase("some information").build())
                .address(new Address.Builder()
                        .zipcode("01067")
                        .city("Dresden")
                        .street("Street")
                        .suite("666")
                        .geo(new Geo.Builder()
                                .lat(51.0504)
                                .lng(13.7373)
                                .build())
                        .build())
                .build();
        return newUser;
    }
}