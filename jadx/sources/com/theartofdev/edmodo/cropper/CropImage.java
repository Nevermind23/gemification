package com.theartofdev.edmodo.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.salesforce.marketingcloud.C11398b;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p571qe.C17494e;

public abstract class CropImage {

    public static final class ActivityResult extends CropImageView.C11848b implements Parcelable {
        public static final Parcelable.Creator<ActivityResult> CREATOR = new C11845a();

        /* renamed from: com.theartofdev.edmodo.cropper.CropImage$ActivityResult$a */
        static class C11845a implements Parcelable.Creator {
            C11845a() {
            }

            /* renamed from: a */
            public ActivityResult createFromParcel(Parcel parcel) {
                return new ActivityResult(parcel);
            }

            /* renamed from: b */
            public ActivityResult[] newArray(int i) {
                return new ActivityResult[i];
            }
        }

        public ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
            super((Bitmap) null, uri, (Bitmap) null, uri2, exc, fArr, rect, rect2, i, i2);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(mo31825e(), i);
            parcel.writeParcelable(mo31828h(), i);
            parcel.writeSerializable(mo31824d());
            parcel.writeFloatArray(mo31822a());
            parcel.writeParcelable(mo31823b(), i);
            parcel.writeParcelable(mo31829i(), i);
            parcel.writeInt(mo31826f());
            parcel.writeInt(mo31827g());
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected ActivityResult(android.os.Parcel r12) {
            /*
                r11 = this;
                r1 = 0
                java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
                java.lang.ClassLoader r2 = r0.getClassLoader()
                android.os.Parcelable r2 = r12.readParcelable(r2)
                android.net.Uri r2 = (android.net.Uri) r2
                r3 = 0
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r12.readParcelable(r0)
                r4 = r0
                android.net.Uri r4 = (android.net.Uri) r4
                java.io.Serializable r0 = r12.readSerializable()
                r5 = r0
                java.lang.Exception r5 = (java.lang.Exception) r5
                float[] r6 = r12.createFloatArray()
                java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
                java.lang.ClassLoader r7 = r0.getClassLoader()
                android.os.Parcelable r7 = r12.readParcelable(r7)
                android.graphics.Rect r7 = (android.graphics.Rect) r7
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r12.readParcelable(r0)
                r8 = r0
                android.graphics.Rect r8 = (android.graphics.Rect) r8
                int r9 = r12.readInt()
                int r10 = r12.readInt()
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropImage.ActivityResult.<init>(android.os.Parcel):void");
        }
    }

    /* renamed from: a */
    public static List m43360a(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Uri b = m43361b(context);
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        for (ResolveInfo next : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = next.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(next.activityInfo.packageName);
            if (b != null) {
                intent2.putExtra("output", b);
            }
            arrayList.add(intent2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Uri m43361b(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
        }
        return null;
    }

    /* renamed from: c */
    public static List m43362c(PackageManager packageManager, String str, boolean z) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        if (str == "android.intent.action.GET_CONTENT") {
            intent = new Intent(str);
        } else {
            intent = new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        intent.setType("image/*");
        for (ResolveInfo next : packageManager.queryIntentActivities(intent, 0)) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = next.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(next.activityInfo.packageName);
            arrayList.add(intent2);
        }
        if (!z) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Intent intent3 = (Intent) it.next();
                if (intent3.getComponent().getClassName().equals("com.android.documentsui.DocumentsActivity")) {
                    arrayList.remove(intent3);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static Intent m43363d(Context context) {
        return m43364e(context, context.getString(C17494e.pick_image_intent_chooser_title), false, true);
    }

    /* renamed from: e */
    public static Intent m43364e(Context context, CharSequence charSequence, boolean z, boolean z2) {
        Intent intent;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        if (!m43367h(context) && z2) {
            arrayList.addAll(m43360a(context, packageManager));
        }
        List c = m43362c(packageManager, "android.intent.action.GET_CONTENT", z);
        if (c.size() == 0) {
            c = m43362c(packageManager, "android.intent.action.PICK", z);
        }
        arrayList.addAll(c);
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            intent = (Intent) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        Intent createChooser = Intent.createChooser(intent, charSequence);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        return createChooser;
    }

    /* renamed from: f */
    public static Uri m43365f(Context context, Intent intent) {
        String action;
        boolean z = true;
        if (!(intent == null || intent.getData() == null || ((action = intent.getAction()) != null && action.equals("android.media.action.IMAGE_CAPTURE")))) {
            z = false;
        }
        if (z || intent.getData() == null) {
            return m43361b(context);
        }
        return intent.getData();
    }

    /* renamed from: g */
    public static boolean m43366g(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), C11398b.f33143v).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String equalsIgnoreCase : strArr) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m43367h(Context context) {
        if (!m43366g(context, "android.permission.CAMERA") || context.checkSelfPermission("android.permission.CAMERA") == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m43368i(Context context, Uri uri) {
        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 || !m43369j(context, uri)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m43369j(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return false;
            }
            openInputStream.close();
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: k */
    public static void m43370k(Activity activity) {
        activity.startActivityForResult(m43363d(activity), BogInputLayout.INPUT_NORMAL_STATE);
    }
}
