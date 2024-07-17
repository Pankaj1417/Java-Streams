package realworld;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PostProcessor {
   static class Post {
        String user;

        public Post(String user, String content) {
            this.user = user;
            this.content = content;
        }

        String content;

        public String getUser() {
            return user;
        }

        public String getContent() {
            return content;
        }
// constructor, getters, and setters
    }

    static List<Post> posts = Arrays.asList(
            new Post("Alice", "Post 1"),
            new Post("Bob", "Post 2"),
            new Post("Alice", "Post 3"),
            new Post("Charlie", "Post 4"),
            new Post("Alice", "Post 5")
    );

//    Given a list of posts, find the user who has made the most posts.
    public static void main(String[] args) {
        String mostActiveUser = posts.stream()
                .collect(Collectors.groupingBy(Post::getUser, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(mostActiveUser);
    }
}
