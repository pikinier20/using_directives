import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dotty.using_directives.custom.Parser;
import dotty.using_directives.custom.utils.Source;
import dotty.using_directives.custom.utils.ast.*;
import json.CustomGsonInstance;
import json.CustomSettingDefOrUsingValueAdapter;
import json.CustomUsingPrimitivesAdapter;
import json.CustomUsingValueAdapter;

import java.io.IOException;
import java.net.URISyntaxException;

public class Test extends TestUtils {
    @org.junit.jupiter.api.Test
    public void test() throws IOException, URISyntaxException {
        Gson gson = CustomGsonInstance.get();
        UsingTree ast = new Parser(new Source(getContent("parser_tests/inputs/testcase6.txt").toCharArray())).parse();
        int codeOffset = ((UsingDefs) ast).getCodeOffset();
        System.out.println(getContent("parser_tests/inputs/testcase6.txt").substring(codeOffset));
    }

}
