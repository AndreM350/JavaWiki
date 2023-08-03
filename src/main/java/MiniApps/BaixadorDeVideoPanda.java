package MiniApps;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class BaixadorDeVideoPanda {
    public static void main(String[] args) {
        try {
            String url = "https://b-vz-446e2dc5-cfa.tv.pandavideo.com.br/0ad31322-0ae5-403c-831c-ea62805c7003/1920x1080/video.m3u8";
            String file = "D:/Renato Asse/video.mp4"; // caminho do arquivo a ser salvo

            URLConnection connection = new URL(url).openConnection();
            InputStream inputStream = connection.getInputStream();

            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] buffer = new byte[4096];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();

            System.out.println("O vídeo foi baixado com sucesso em " + file);
        } catch (Exception e) {
            System.err.println("Ocorreu um erro ao baixar o vídeo: " + e.getMessage());
        }
    }


}
