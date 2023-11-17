package com.threatmetrix.TrustDefender;

import android.security.KeyChain;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11969r1;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import p626ue.C18114a;

/* renamed from: com.threatmetrix.TrustDefender.i */
public abstract class C11911i {

    /* renamed from: a */
    private static final String f34841a = C11907h.m43615j(C11911i.class);

    /* renamed from: b */
    public static int f34842b = 79;

    /* renamed from: c */
    public static int f34843c = 78;

    /* renamed from: d */
    public static int f34844d = 1;

    /* renamed from: e */
    public static int f34845e = 2;

    static {
        int i = f34842b;
        if ((i * (f34844d + i)) % f34845e != 0) {
        }
    }

    /* renamed from: a */
    public static boolean m43638a(PrivateKey privateKey, String str) {
        KeyInfo f = m43643f(privateKey, str);
        if (f != null) {
            return f.getOrigin() == 1;
        }
        String str2 = f34841a;
        int i = f34842b;
        if ((i * (f34844d + i)) % f34845e != 0) {
            f34842b = 99;
            int c = m43640c();
            f34843c = c;
            int i2 = f34842b;
            if (((f34844d + i2) * i2) % f34845e != c) {
                f34842b = m43640c();
                f34843c = m43640c();
            }
        }
        C11907h.C11908a.m43624b(str2, C18114a.m62170f("1P^\u0018f\u0013W][Zc\u0019e`u\u001dmqihkq0%xly~s}qq.r|r\u0006\u0007y\t6x\u000b~:\n\f\u0012>\u0001\u0017\u0003\f\u0010\u0006\b\u0013\rV", 171, 189, 2));
        return true;
    }

    /* renamed from: b */
    public static KeyPair m43639b(String str, String str2, String str3) {
        int i = 0;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                while (true) {
                    try {
                        int[] iArr = new int[-1];
                    } catch (Exception unused2) {
                        if (!C11969r1.C11972c.m43952a()) {
                            C11907h.C11908a.m43624b(f34841a, C18114a.m62170f("m\u000b\u0017N\u001bE\f\t\u0011\u0007\u0013\u0001\u0013\u0003<\u0007\u0013\fC6\by\u0005\bz\u0003tr-owk|{ly%eug!nnr\u001d]q[bdXXaY!", 206, 'y', 0));
                            return null;
                        } else if (!KeyChain.isKeyAlgorithmSupported(str)) {
                            return null;
                        } else {
                            try {
                                KeyPairGenerator instance = KeyPairGenerator.getInstance(str, str2);
                                KeyGenParameterSpec.Builder digests = new KeyGenParameterSpec.Builder(str3, 5).setDigests(new String[]{C18114a.m62170f("G=7$*.0", 'q', 129, 3)});
                                if (C18114a.m62167c("BB/", 'Z', 2).equals(str)) {
                                    digests = digests.setSignaturePaddings(new String[]{C18114a.m62167c("kg`qP", 'M', 3)});
                                }
                                instance.initialize(digests.build());
                                return instance.generateKeyPair();
                            } catch (InvalidAlgorithmParameterException | NoSuchProviderException e) {
                                String str4 = f34841a;
                                int i2 = f34842b;
                                if (((f34844d + i2) * i2) % f34845e != f34843c) {
                                    f34842b = m43640c();
                                    f34843c = m43640c();
                                }
                                C11907h.m43612g(str4, C18114a.m62170f("[x\u0005<\t3u\u0004up\u0003r,Vo\u0003Xhow$~", 15, 166, 0), e.toString());
                                return null;
                            } catch (NoSuchAlgorithmException e2) {
                                C11907h.C11908a.m43625c(f34841a, C18114a.m62170f("n\u000e\u001cU$P\u0015%\u0019\u0016*\u001cW\u0004\u001f4\f\u001e'1_<?", 129, 168, 3), e2.toString());
                                return null;
                            } catch (Throwable th) {
                                C11907h.m43611f(f34841a, C18114a.m62167c("e\u0005\u0013L\u001bG\f\u001c\u0010\r!\u0013Nz\u0016+\u0003\u0015\u001e(V_+/)0&+$_&:&)5:077rjGJ", 144, 3), th.toString());
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static int m43640c() {
        return 10;
    }

    /* renamed from: d */
    public static int m43641d() {
        return 0;
    }

    /* renamed from: e */
    public static boolean m43642e(PrivateKey privateKey, String str) {
        KeyInfo f = m43643f(privateKey, str);
        if (f == null) {
            C11907h.C11908a.m43624b(f34841a, C18114a.m62170f("'FT\u000e\\\tMSQPY\u000f[Vk\u0013hnf\\$\u0019l`mrgqee\"fpfyzm|*l~r.}\u00062t\u000bv\u0004y{\u0007\u0001J", 'D', 31, 3));
            return false;
        }
        boolean isInsideSecureHardware = f.isInsideSecureHardware();
        String str2 = f34841a;
        C11907h.C11908a.m43624b(str2, C18114a.m62170f("Wop\u0003k{m'hfgnge ", 16, 158, 0) + isInsideSecureHardware);
        return isInsideSecureHardware;
    }

    /* renamed from: f */
    private static KeyInfo m43643f(PrivateKey privateKey, String str) {
        if (C11969r1.C11972c.m43952a() && C11969r1.C11983n.C11984a.f35247c >= 23 && privateKey != null) {
            try {
                String algorithm = privateKey.getAlgorithm();
                int i = f34842b;
                if (((f34844d + i) * i) % f34845e != f34843c) {
                    f34842b = m43640c();
                    f34843c = 83;
                }
                return (KeyInfo) KeyFactory.getInstance(algorithm, str).getKeySpec(privateKey, KeyInfo.class);
            } catch (NoSuchAlgorithmException e) {
                C11907h.C11908a.m43625c(f34841a, C18114a.m62167c("%DR\fZ\u0007TXKO\faVT\u0010<WlGiei]\u0019ux", 'p', 3), e.toString());
                int i2 = f34842b;
                if (((f34844d + i2) * i2) % f34845e != m43641d()) {
                    f34842b = 90;
                    f34843c = 86;
                }
            } catch (NoSuchProviderException | InvalidKeySpecException e2) {
                C11907h.m43612g(f34841a, C18114a.m62167c("\u00132@yHt9I=:N@{(CX0BKU\u0004`c", 'o', 1), e2.toString());
            } catch (Throwable th) {
                C11907h.m43611f(f34841a, C18114a.m62167c("j\n\u0018Q L\u0011!\u0015\u0012&\u0018S\u001b0\b\u001a#-[d04.5+0)d+?+.:?5<<woLO", 140, 1), th.toString());
            }
        }
        return null;
    }
}
