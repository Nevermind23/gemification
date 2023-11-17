package com.threatmetrix.TrustDefender;

import android.content.Context;
import androidx.annotation.Keep;

@Keep
public class NativeGathererHelper {
    public boolean bf0066f0066f0066(String str, String str2, boolean z, boolean z2) {
        System.loadLibrary(str2);
        return init(15, z, z2);
    }

    public native int cancel();

    public native String[] checkURLs(String[] strArr);

    public void finalize() {
        super.finalize();
        finit();
    }

    public native void finit();

    public native Object getAddresses(Class cls);

    public native long getAppTime(String str);

    public native String getBinaryArch();

    public native String getConnections(Context context);

    public native int getCpuCores();

    public native String[] getFontList(String str);

    public native int getIntConfig(Context context, String str, String str2);

    public native long getLongConfig(Context context, String str, String str2);

    public native String[] getNetworkInfo();

    public native String getRandomString(int i);

    public native int getSelinuxMode();

    public native String getStringConfig(Context context, String str, String str2);

    public native long getTamperCode(int i);

    public native String getTextSectionHash(String str);

    public native String hashFile(String str, int i);

    public native boolean init(int i, boolean z, boolean z2);

    public native int jniDetectedDebugStatus(String str);

    public native String md5(String str);

    public native void setInfoLogging(int i);

    public native int setIntConfig(Context context, String str, String str2, int i);

    public native int setLongConfig(Context context, String str, String str2, long j);

    public native int setStringConfig(Context context, String str, String str2, String str3);

    public native String sha1Base32Encode(byte[] bArr);

    public native String sha1HexEncode(byte[] bArr);

    public native String sha256HexEncode(byte[] bArr);

    public native String urlEncode(String str);

    public native String validatePackage(String str);

    public native int waitUntilCancelled();

    public native String xor(String str, String str2);
}
