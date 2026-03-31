#Controller

@RestController
@RequestMapping("/posts")
public class PostController {

    private List<String> posts = new ArrayList<>();

    @PostMapping
    public String add(String content) {
        posts.add(content);
        return "added";
    }

    @GetMapping
    public List<String> list() {
        return posts;
    }
}
