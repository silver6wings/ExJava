import java.util.Arrays;

public class test_list_contains {

    private static final String[] VALID_ASSET_TYPES = {"vod", "live"};

    public static void main(String[] args) {
        System.out.println(Arrays.asList(VALID_ASSET_TYPES).contains("vod"));
    }
}
