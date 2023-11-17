package p022b4;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b4.b */
public final class C2156b {

    /* renamed from: a */
    private final List f6332a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo7030a(ImageHeaderParser imageHeaderParser) {
        this.f6332a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List mo7031b() {
        return this.f6332a;
    }
}
