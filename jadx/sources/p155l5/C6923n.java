package p155l5;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: l5.n */
public abstract class C6923n {
    /* renamed from: a */
    static C6923n m26907a(long j) {
        return new C6911h(j);
    }

    /* renamed from: b */
    public static C6923n m26908b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m26907a(Long.parseLong(jsonReader.nextString()));
                } else {
                    C6923n a = m26907a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo21060c();
}
