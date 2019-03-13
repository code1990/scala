import com.alibaba.fastjson.JSON;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import scala.util.parsing.json.JSONObject;
//import sun.net.www.http.HttpClient;
//import sun.rmi.runtime.Log;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = readTxt("C:\\Users\\issuser\\Desktop\\11.txt");
        for(String isbn:list){
//            System.out.println(isbn);
            String str = getBookJson(isbn);
            com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(str);
            if (jsonObject != null) {
//                System.out.println(jsonObject);
                com.alibaba.fastjson.JSONObject object = JSON.parseObject(jsonObject.get("rating").toString());
                System.out.println(object.get("average")+"("+object.get("numRaters")+"人评价)");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
//        String isbn = "978-7-115-38640-3";

    }

    public static void createFile(){
        List<String> list = readTxt("C:\\Users\\issuser\\Desktop\\11.txt");
        for (String str:list) {
            String path = str.substring(0,str.lastIndexOf("\\"));
            if(!new File(str).exists()){
                try {
                    new File(path).mkdirs();
                    new File(str).createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static List<String> readTxt(String path){
        List<String> list = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            list = new ArrayList<>();
            File file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";

            while ((str = bufferedReader.readLine()) != null) {
                if (!"".equals(str)) {
                    list.add(str);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return list;
    }

    public static void getPath(){
        String path = "D:\\BaiduNetdiskDownload\\尚硅谷大数据\\20_尚硅谷大数据技术之Scala-9.8-9.12\\3.code\\scala\\Practice\\src\\main\\scala\\com\\atguigu\\scala";
        File file = new File(path);
        if(file.isDirectory()){
            File[] array = file.listFiles();
            for (File f:array) {
                if (f.isDirectory()){
                    File[] array1 = f.listFiles();
                    for (int i = 0; i < array1.length; i++) {
                        if(array1[i].isDirectory()){
                            File[] array2 = array1[i].listFiles();
                            for (File f2:array2 ) {
                                System.out.println(f2.getAbsolutePath());
                            }
                        }else{
                            System.out.println(array1[i].getAbsolutePath());
                        }

                    }
                }
            }
        }
    }

    public static String getBookJson(String isbn) {
        HttpClient client = new DefaultHttpClient();
        HttpGet httpGet = null;
        HttpResponse response = null;
        String resultJson = null;
        try {
            String doubanUrl = "https://api.douban.com/v2/book/isbn/"+isbn;
            httpGet = new HttpGet(doubanUrl);
            httpGet.setHeader("Host", "api.douban.com");
            httpGet.setHeader(
                    "User-Agent",
                    "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36");
            response = client.execute(httpGet);
            int code = response.getStatusLine().getStatusCode();
            if (code == 200) {

                resultJson = EntityUtils
                        .toString(response.getEntity(), "utf-8");
//                Log.e("MainActivity", resultJson);
                return resultJson;
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";

    }
}
