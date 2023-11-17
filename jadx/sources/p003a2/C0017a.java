package p003a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p048d2.C5804f;

/* renamed from: a2.a */
public class C0017a implements C0020d {

    /* renamed from: d */
    private final HttpURLConnection f51d;

    public C0017a(HttpURLConnection httpURLConnection) {
        this.f51d = httpURLConnection;
    }

    /* renamed from: a */
    private String m110a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: A */
    public String mo70A() {
        try {
            if (mo74u0()) {
                return null;
            }
            return "Unable to fetch " + this.f51d.getURL() + ". Failed with " + this.f51d.getResponseCode() + "\n" + m110a(this.f51d);
        } catch (IOException e) {
            C5804f.m23335d("get error failed ", e);
            return e.getMessage();
        }
    }

    /* renamed from: c0 */
    public String mo71c0() {
        return this.f51d.getContentType();
    }

    public void close() {
        this.f51d.disconnect();
    }

    /* renamed from: k0 */
    public InputStream mo73k0() {
        return this.f51d.getInputStream();
    }

    /* renamed from: u0 */
    public boolean mo74u0() {
        try {
            return this.f51d.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
