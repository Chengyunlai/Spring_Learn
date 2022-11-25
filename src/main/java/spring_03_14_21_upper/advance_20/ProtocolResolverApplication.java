package spring_03_14_21_upper.advance_20;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import spring_03_14_21_upper.advance_20.protocolResolver.DogProtocolResolver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ProtocolResolverApplication  {
    public static void main(String[] args) throws Exception {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        DogProtocolResolver dogProtocolResolver = new DogProtocolResolver();
        resourceLoader.addProtocolResolver(dogProtocolResolver);

        Resource resource = resourceLoader.getResource("dog:Dog.txt");
        InputStream inputStream = resource.getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(reader);
        String readLine;
        while ((readLine = br.readLine()) != null) {
            System.out.println(readLine);
        }
        br.close();
    }
}
