package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.C1002c;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.github.mikephil.charting.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f3469k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3470a;

    /* renamed from: b */
    Object f3471b;

    /* renamed from: c */
    public byte[] f3472c;

    /* renamed from: d */
    public Parcelable f3473d;

    /* renamed from: e */
    public int f3474e;

    /* renamed from: f */
    public int f3475f;

    /* renamed from: g */
    public ColorStateList f3476g;

    /* renamed from: h */
    PorterDuff.Mode f3477h;

    /* renamed from: i */
    public String f3478i;

    /* renamed from: j */
    public String f3479j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    static class C0832a {
        /* renamed from: a */
        static int m3126a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0834c.m3134a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        /* renamed from: b */
        static String m3127b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0834c.m3135b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        /* renamed from: c */
        static int m3128c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0834c.m3136c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        /* renamed from: d */
        static Uri m3129d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0834c.m3137d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (InvocationTargetException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        /* renamed from: e */
        static Drawable m3130e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: f */
        static Icon m3131f(IconCompat iconCompat, Context context) {
            Icon icon;
            switch (iconCompat.f3470a) {
                case -1:
                    return (Icon) iconCompat.f3471b;
                case 1:
                    icon = Icon.createWithBitmap((Bitmap) iconCompat.f3471b);
                    break;
                case 2:
                    icon = Icon.createWithResource(iconCompat.mo3302f(), iconCompat.f3474e);
                    break;
                case 3:
                    icon = Icon.createWithData((byte[]) iconCompat.f3471b, iconCompat.f3474e, iconCompat.f3475f);
                    break;
                case 4:
                    icon = Icon.createWithContentUri((String) iconCompat.f3471b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        icon = Icon.createWithBitmap(IconCompat.m3112a((Bitmap) iconCompat.f3471b, false));
                        break;
                    } else {
                        icon = C0833b.m3133b((Bitmap) iconCompat.f3471b);
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        icon = C0835d.m3138a(iconCompat.mo3304h());
                        break;
                    } else if (context != null) {
                        InputStream i2 = iconCompat.mo3305i(context);
                        if (i2 != null) {
                            if (i < 26) {
                                icon = Icon.createWithBitmap(IconCompat.m3112a(BitmapFactory.decodeStream(i2), false));
                                break;
                            } else {
                                icon = C0833b.m3133b(BitmapFactory.decodeStream(i2));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.mo3304h());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.mo3304h());
                    }
                default:
                    throw new IllegalArgumentException("Unknown type");
            }
            ColorStateList colorStateList = iconCompat.f3476g;
            if (colorStateList != null) {
                icon.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3477h;
            if (mode != IconCompat.f3469k) {
                icon.setTintMode(mode);
            }
            return icon;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    static class C0833b {
        /* renamed from: a */
        static Drawable m3132a(Drawable drawable, Drawable drawable2) {
            C0843e.m3176a();
            return C0842d.m3175a(drawable, drawable2);
        }

        /* renamed from: b */
        static Icon m3133b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    static class C0834c {
        /* renamed from: a */
        static int m3134a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        static String m3135b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        static int m3136c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        static Uri m3137d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    static class C0835d {
        /* renamed from: a */
        static Icon m3138a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f3470a = -1;
        this.f3472c = null;
        this.f3473d = null;
        this.f3474e = 0;
        this.f3475f = 0;
        this.f3476g = null;
        this.f3477h = f3469k;
        this.f3478i = null;
    }

    /* renamed from: a */
    static Bitmap m3112a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, Utils.FLOAT_EPSILON, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m3113b(Bitmap bitmap) {
        C1002c.m3511c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3471b = bitmap;
        return iconCompat;
    }

    /* renamed from: c */
    public static IconCompat m3114c(Resources resources, String str, int i) {
        C1002c.m3511c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3474e = i;
            if (resources != null) {
                try {
                    iconCompat.f3471b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3471b = str;
            }
            iconCompat.f3479j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: n */
    private static String m3115n(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: d */
    public Bitmap mo3300d() {
        int i = this.f3470a;
        if (i == -1) {
            Object obj = this.f3471b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f3471b;
        } else {
            if (i == 5) {
                return m3112a((Bitmap) this.f3471b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: e */
    public int mo3301e() {
        int i = this.f3470a;
        if (i == -1) {
            return C0832a.m3126a(this.f3471b);
        }
        if (i == 2) {
            return this.f3474e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: f */
    public String mo3302f() {
        int i = this.f3470a;
        if (i == -1) {
            return C0832a.m3127b(this.f3471b);
        }
        if (i == 2) {
            String str = this.f3479j;
            if (str == null || TextUtils.isEmpty(str)) {
                return ((String) this.f3471b).split(":", -1)[0];
            }
            return this.f3479j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: g */
    public int mo3303g() {
        int i = this.f3470a;
        if (i == -1) {
            return C0832a.m3128c(this.f3471b);
        }
        return i;
    }

    /* renamed from: h */
    public Uri mo3304h() {
        int i = this.f3470a;
        if (i == -1) {
            return C0832a.m3129d(this.f3471b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3471b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: i */
    public InputStream mo3305i(Context context) {
        Uri h = mo3304h();
        String scheme = h.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + h, e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3471b));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + h, e2);
                return null;
            }
        }
    }

    /* renamed from: j */
    public void mo3306j() {
        this.f3477h = PorterDuff.Mode.valueOf(this.f3478i);
        switch (this.f3470a) {
            case -1:
                Parcelable parcelable = this.f3473d;
                if (parcelable != null) {
                    this.f3471b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3473d;
                if (parcelable2 != null) {
                    this.f3471b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3472c;
                this.f3471b = bArr;
                this.f3470a = 3;
                this.f3474e = 0;
                this.f3475f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3472c, Charset.forName("UTF-16"));
                this.f3471b = str;
                if (this.f3470a == 2 && this.f3479j == null) {
                    this.f3479j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3471b = this.f3472c;
                return;
            default:
                return;
        }
    }

    /* renamed from: k */
    public void mo3307k(boolean z) {
        this.f3478i = this.f3477h.name();
        switch (this.f3470a) {
            case -1:
                if (!z) {
                    this.f3473d = (Parcelable) this.f3471b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f3471b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3472c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f3473d = (Parcelable) this.f3471b;
                return;
            case 2:
                this.f3472c = ((String) this.f3471b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3472c = (byte[]) this.f3471b;
                return;
            case 4:
            case 6:
                this.f3472c = this.f3471b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            default:
                return;
        }
    }

    /* renamed from: l */
    public Icon mo3308l() {
        return mo3309m((Context) null);
    }

    /* renamed from: m */
    public Icon mo3309m(Context context) {
        return C0832a.m3131f(this, context);
    }

    public String toString() {
        if (this.f3470a == -1) {
            return String.valueOf(this.f3471b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m3115n(this.f3470a));
        switch (this.f3470a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3471b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3471b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3479j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo3301e())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3474e);
                if (this.f3475f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3475f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3471b);
                break;
        }
        if (this.f3476g != null) {
            sb.append(" tint=");
            sb.append(this.f3476g);
        }
        if (this.f3477h != f3469k) {
            sb.append(" mode=");
            sb.append(this.f3477h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i) {
        this.f3472c = null;
        this.f3473d = null;
        this.f3474e = 0;
        this.f3475f = 0;
        this.f3476g = null;
        this.f3477h = f3469k;
        this.f3478i = null;
        this.f3470a = i;
    }
}
