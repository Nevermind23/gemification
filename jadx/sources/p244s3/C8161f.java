package p244s3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import java.io.IOException;
import java.io.InputStream;
import p076f4.C6156d;
import p166m3.C7079a;
import p166m3.C7088h;
import p244s3.C8188n;
import p296w3.C8759i;
import p296w3.C8763m;

/* renamed from: s3.f */
public final class C8161f implements C8188n {

    /* renamed from: a */
    private final Context f23306a;

    /* renamed from: b */
    private final C8166e f23307b;

    /* renamed from: s3.f$a */
    private static final class C8162a implements C8190o, C8166e {

        /* renamed from: a */
        private final Context f23308a;

        C8162a(Context context) {
            this.f23308a = context;
        }

        /* renamed from: a */
        public Class mo23348a() {
            return AssetFileDescriptor.class;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8161f(this.f23308a, this);
        }

        /* renamed from: e */
        public void mo23349b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        /* renamed from: f */
        public AssetFileDescriptor mo23350c(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }
    }

    /* renamed from: s3.f$b */
    private static final class C8163b implements C8190o, C8166e {

        /* renamed from: a */
        private final Context f23309a;

        C8163b(Context context) {
            this.f23309a = context;
        }

        /* renamed from: a */
        public Class mo23348a() {
            return Drawable.class;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8161f(this.f23309a, this);
        }

        /* renamed from: e */
        public void mo23349b(Drawable drawable) {
        }

        /* renamed from: f */
        public Drawable mo23350c(Resources.Theme theme, Resources resources, int i) {
            return C8759i.m32587a(this.f23309a, i, theme);
        }
    }

    /* renamed from: s3.f$c */
    private static final class C8164c implements C8190o, C8166e {

        /* renamed from: a */
        private final Context f23310a;

        C8164c(Context context) {
            this.f23310a = context;
        }

        /* renamed from: a */
        public Class mo23348a() {
            return InputStream.class;
        }

        /* renamed from: d */
        public C8188n mo23331d(C8196r rVar) {
            return new C8161f(this.f23310a, this);
        }

        /* renamed from: e */
        public void mo23349b(InputStream inputStream) {
            inputStream.close();
        }

        /* renamed from: f */
        public InputStream mo23350c(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }
    }

    /* renamed from: s3.f$d */
    private static final class C8165d implements C2415d {

        /* renamed from: d */
        private final Resources.Theme f23311d;

        /* renamed from: e */
        private final Resources f23312e;

        /* renamed from: f */
        private final C8166e f23313f;

        /* renamed from: g */
        private final int f23314g;

        /* renamed from: h */
        private Object f23315h;

        C8165d(Resources.Theme theme, Resources resources, C8166e eVar, int i) {
            this.f23311d = theme;
            this.f23312e = resources;
            this.f23313f = eVar;
            this.f23314g = i;
        }

        /* renamed from: a */
        public Class mo7781a() {
            return this.f23313f.mo23348a();
        }

        /* renamed from: b */
        public void mo7786b() {
            Object obj = this.f23315h;
            if (obj != null) {
                try {
                    this.f23313f.mo23349b(obj);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C7079a mo7789d() {
            return C7079a.LOCAL;
        }

        /* renamed from: e */
        public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
            try {
                Object c = this.f23313f.mo23350c(this.f23311d, this.f23312e, this.f23314g);
                this.f23315h = c;
                aVar.mo7798f(c);
            } catch (Resources.NotFoundException e) {
                aVar.mo7797c(e);
            }
        }
    }

    /* renamed from: s3.f$e */
    private interface C8166e {
        /* renamed from: a */
        Class mo23348a();

        /* renamed from: b */
        void mo23349b(Object obj);

        /* renamed from: c */
        Object mo23350c(Resources.Theme theme, Resources resources, int i);
    }

    C8161f(Context context, C8166e eVar) {
        this.f23306a = context.getApplicationContext();
        this.f23307b = eVar;
    }

    /* renamed from: c */
    public static C8190o m30808c(Context context) {
        return new C8162a(context);
    }

    /* renamed from: e */
    public static C8190o m30809e(Context context) {
        return new C8163b(context);
    }

    /* renamed from: g */
    public static C8190o m30810g(Context context) {
        return new C8164c(context);
    }

    /* renamed from: d */
    public C8188n.C8189a mo23326a(Integer num, int i, int i2, C7088h hVar) {
        Resources resources;
        Resources.Theme theme = (Resources.Theme) hVar.mo21312c(C8763m.f24613b);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.f23306a.getResources();
        }
        return new C8188n.C8189a(new C6156d(num), new C8165d(theme, resources, this.f23307b, num.intValue()));
    }

    /* renamed from: f */
    public boolean mo23327b(Integer num) {
        return true;
    }
}
