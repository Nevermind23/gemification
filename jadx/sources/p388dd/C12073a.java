package p388dd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Size;
import java.io.ByteArrayOutputStream;
import java.text.DecimalFormat;
import kotlin.jvm.internal.C41536l;
import p625ud.C18110b;

/* renamed from: dd.a */
public final class C12073a {

    /* renamed from: a */
    public static final C12073a f35481a = new C12073a();

    /* renamed from: b */
    private static final DecimalFormat f35482b = new DecimalFormat("0.00");

    /* renamed from: c */
    public static Size f35483c;

    private C12073a() {
    }

    /* renamed from: a */
    public final Bitmap mo32216a(C18110b bVar) {
        C41536l.m120489i(bVar, "frame");
        if (bVar.mo45792d() == byte[].class) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new YuvImage((byte[]) bVar.mo45791c(), 17, bVar.mo45795f().mo27062e(), bVar.mo45795f().mo27060c(), (int[]) null).compressToJpeg(new Rect(0, 0, bVar.mo45795f().mo27062e(), bVar.mo45795f().mo27060c()), 90, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        } else if (bVar.mo45792d() != Image.class) {
            return null;
        } else {
            Object c = bVar.mo45791c();
            C41536l.m120488h(c, "frame.getData()");
            return C12074b.f35484a.mo32225g((Image) c);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0073 A[Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo32217b(android.content.Context r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0005
            java.lang.String r13 = ""
            return r13
        L_0x0005:
            java.lang.String r0 = "camera"
            java.lang.Object r13 = r13.getSystemService(r0)
            if (r13 == 0) goto L_0x00bd
            android.hardware.camera2.CameraManager r13 = (android.hardware.camera2.CameraManager) r13
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String[] r1 = r13.getCameraIdList()     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.String r2 = "manager.cameraIdList"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            int r2 = r1.length     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            r3 = 0
            r4 = r3
        L_0x0020:
            if (r4 >= r2) goto L_0x0099
            r5 = r1[r4]     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            int r4 = r4 + 1
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            r6.<init>()     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.String r7 = "camera_id"
            r6.put(r7, r5)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            kotlin.jvm.internal.C41536l.m120486f(r5)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            android.hardware.camera2.CameraCharacteristics r5 = r13.getCameraCharacteristics(r5)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.String r7 = "manager.getCameraCharacteristics(cameraId!!)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r7)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.Object r7 = r5.get(r7)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            android.util.Size r7 = (android.util.Size) r7     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            kotlin.jvm.internal.C41536l.m120486f(r7)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            int r8 = r7.getWidth()     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            int r9 = r7.getHeight()     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            int r8 = r8 * r9
            float r8 = (float) r8     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            r9 = 1232348160(0x49742400, float:1000000.0)
            float r8 = r8 / r9
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.Object r9 = r5.get(r9)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.Object r5 = r5.get(r10)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            if (r5 != 0) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            int r5 = r5.intValue()     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            if (r5 != 0) goto L_0x0070
            r5 = 1
            goto L_0x0071
        L_0x0070:
            r5 = r3
        L_0x0071:
            if (r5 != 0) goto L_0x0076
            r12.mo32218c(r7)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
        L_0x0076:
            java.lang.String r10 = "front_facing"
            r6.put(r10, r5)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.String r5 = "pixel_array"
            r6.put(r5, r7)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.String r5 = "pixels"
            java.text.DecimalFormat r7 = f35482b     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            double r10 = (double) r8     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.String r8 = r7.format(r10)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            r6.put(r5, r8)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.String r5 = "orientation"
            java.lang.String r7 = r7.format(r9)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            r6.put(r5, r7)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            r0.put(r6)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            goto L_0x0020
        L_0x0099:
            java.lang.String r13 = r0.toString()     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.String r0 = r0.toString()     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            java.lang.String r13 = java.net.URLEncoder.encode(r13, r0)     // Catch:{ CameraAccessException -> 0x00b7, JSONException -> 0x00b2, UnsupportedEncodingException -> 0x00ad, Exception -> 0x00a8 }
            return r13
        L_0x00a8:
            r13 = move-exception
            r13.printStackTrace()
            goto L_0x00bb
        L_0x00ad:
            r13 = move-exception
            r13.printStackTrace()
            goto L_0x00bb
        L_0x00b2:
            r13 = move-exception
            r13.printStackTrace()
            goto L_0x00bb
        L_0x00b7:
            r13 = move-exception
            r13.printStackTrace()
        L_0x00bb:
            r13 = 0
            return r13
        L_0x00bd:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.hardware.camera2.CameraManager"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p388dd.C12073a.mo32217b(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    public final void mo32218c(Size size) {
        C41536l.m120489i(size, "<set-?>");
        f35483c = size;
    }
}
