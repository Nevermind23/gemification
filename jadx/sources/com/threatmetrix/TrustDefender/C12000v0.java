package com.threatmetrix.TrustDefender;

import android.content.Context;
import android.security.KeyChain;
import android.security.KeyPairGeneratorSpec;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11969r1;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Locale;
import javax.security.auth.x500.X500Principal;
import p585re.C17594k;
import p585re.C17603t;
import p626ue.C18114a;

/* renamed from: com.threatmetrix.TrustDefender.v0 */
public abstract class C12000v0 {

    /* renamed from: a */
    private static final String f35326a;

    /* renamed from: b */
    private static final String f35327b = C18114a.m62170f("\n6+84-'\r&9\u00122,. ", '/', 135, 1);

    /* renamed from: c */
    private static final String f35328c = C18114a.m62167c("0MOLL\u001b;;9A66B\"\u0012\u0018", 163, 5);

    /* renamed from: d */
    private static final String f35329d = C18114a.m62170f("VN^OaJZLEXMGA", 210, 189, 1);

    /* renamed from: e */
    public static long f35330e = 0;

    /* renamed from: f */
    private static String f35331f = null;

    /* renamed from: g */
    private static PublicKey f35332g = null;

    /* renamed from: h */
    public static PrivateKey f35333h = null;

    /* renamed from: i */
    private static boolean f35334i = false;

    /* renamed from: j */
    private static boolean f35335j = false;

    /* renamed from: k */
    public static int f35336k = 69;

    /* renamed from: l */
    public static int f35337l = 1;

    /* renamed from: m */
    public static int f35338m = 2;

    /* renamed from: n */
    public static int f35339n;

    static {
        String j = C11907h.m43615j(C12000v0.class);
        int i = f35336k;
        if (((f35337l + i) * i) % f35338m != f35339n) {
            f35336k = m44083e();
            f35339n = m44083e();
        }
        int i2 = f35336k;
        if ((i2 * (f35337l + i2)) % m44088j() != 0) {
            f35336k = 40;
            f35339n = 84;
        }
        f35326a = j;
    }

    /* renamed from: a */
    private static void m44079a(KeyStore keyStore) {
        if (keyStore != null) {
            try {
                keyStore.deleteEntry(C18114a.m62167c("(EGDD\u00133319..:\u001a\n\u0010", 149, 4));
            } catch (KeyStoreException e) {
                C11907h.C11908a.m43627e(f35326a, C18114a.m62170f("Xu\u00029\u00060ssyqom({nj$rne jcv\u001calhe\u0017AZmFf`bT\u000ehi", 'M', 'b', 0), e.toString());
            }
        }
    }

    /* renamed from: b */
    private static boolean m44080b(Context context) {
        if (!C11969r1.C11972c.m43955d()) {
            C11907h.C11908a.m43624b(f35326a, C18114a.m62167c("7QcVjUg[\u0017Kmljjd\u001eHD!kv$su{(j\u0001luyoq|v", 206, 1));
            return false;
        } else if (f35334i) {
            C11907h.C11908a.m43624b(f35326a, C18114a.m62170f("c\u0010\u0017\u000b\b\f\"I\u001f\u001e\u0016\u0013\u0013O%!R\u001b\u001a*V \u001a,\u001f3\u001e0$_##&/**f\u0013.C\u001b-6@n1?6r:6?C==", 29, 5, 3));
            return false;
        } else if (f35333h == null || f35332g == null) {
            try {
                KeyStore instance = KeyStore.getInstance(C18114a.m62170f("FrgtpicIbuNnhj\\", 169, 174, 0));
                int i = f35336k;
                if ((i * (f35337l + i)) % f35338m != 0) {
                    f35336k = 43;
                    f35339n = 73;
                }
                Key key = null;
                instance.load((KeyStore.LoadStoreParameter) null);
                Key key2 = instance.getKey(C18114a.m62170f("%DHGI\u001a<>>H?AO1#+", 'y', 'V', 3), (char[]) null);
                if (!(key2 instanceof PrivateKey) || m44081c((PrivateKey) key2, C18114a.m62167c("\u0014B9HFA=%@U0RNRF", 'R', 0))) {
                    key = key2;
                } else {
                    C11907h.C11908a.m43623a(f35326a, C18114a.m62167c(" ;PwBMzJLR~GFPHVFZLL\u0015\nOQYScU\u0011[g\u0014Vd[\u0018`_iao_see\"d$sk~(xxp", 28, 1));
                    f35335j = true;
                    m44079a(instance);
                }
                if (key instanceof PrivateKey) {
                    String str = f35326a;
                    C11907h.C11908a.m43624b(str, C18114a.m62170f("\\\t\u0010\u0004\u0001\u0005\u001bB\f\u0006\u001c\fG\nIu\u0011&}\u0010\u0019#Q('\u001e$\u001eW-\"\u001c0", 219, 189, 3));
                    PrivateKey privateKey = (PrivateKey) key;
                    if (!m44085g(privateKey, C18114a.m62167c("4`Ub^WQ7Pc<\\VXJ", 197, 4))) {
                        C11907h.C11908a.m43624b(str, C18114a.m62167c("ezx4\u0001{\u00118\u0003\t;\u0011\u0006\u0004?k\u0007\u001cv\u0019\u0015\u0019\rH\u0013\u001eK\u001b\u001d#O\u0019\u0013%\u0018,\u0017)\u001dX\u001c\u001c\u001f(##", 175, 1));
                        f35334i = true;
                        return false;
                    }
                    f35332g = instance.getCertificate(C18114a.m62167c("/NRQS$FHHRIKY;-5", 172, 3)).getPublicKey();
                    f35333h = privateKey;
                } else {
                    String str2 = f35326a;
                    C11907h.C11908a.m43624b(str2, C18114a.m62170f("?m_Zl`d\\\u0014T\u0012_Uf\u000e8Qd:JQY", 'T', '/', 1));
                    String c = C18114a.m62167c("\u0003\u0002", 'i', 1);
                    int i2 = f35336k;
                    if ((i2 * (f35337l + i2)) % f35338m != 0) {
                        f35336k = m44083e();
                        f35339n = m44083e();
                    }
                    KeyPair i3 = m44087i(c, context, C18114a.m62167c("t!\u0016#\u001f\u0018\u0012w\u0011$|\u001d\u0017\u0019\u000b", 'n', 2), C18114a.m62170f(":WYVV%EECK@@L,\u001c\"", '[', 192, 0));
                    if (i3 == null || !m44085g(i3.getPrivate(), C18114a.m62167c(">j_lha[AZmFf`bT", 1, 2))) {
                        C11907h.C11908a.m43624b(str2, C18114a.m62170f("c\u0003\u0011J\u0019E\n\u001a\u000e\u000b\u001f\u0011L\u000fNz\u0016+\u0003\u0015\u001e(V/\".#[\u0002*+)16,'d\t<:?/j-95>B:F;AtEIwBNzEP}MOU\u0002KEWJ^I[O\u000bNNQZUU\u001e\u0013hgo`f`\u001aMO>", 146, 'r', 2));
                        i3 = m44087i(C18114a.m62170f("mo^", '`', 196, 2), context, C18114a.m62170f("V\u0003w\u0005\u0001ysYr\u0006^~xzl", 200, '!', 1), C18114a.m62167c("\u0005$(')y\u001c\u001e\u001e(\u001f!/\u0011\u0003\u000b", 16, 1));
                        if (i3 != null) {
                            if (!m44085g(i3.getPrivate(), C18114a.m62167c("x'\u001e-+&\"\n%:\u0015737+", 230, 1))) {
                            }
                        }
                        C11907h.C11908a.m43624b(str2, C18114a.m62167c("-LZ\u0014b\u000fScWThZ\u0016B]rJ\\eo\u001eviuj#VXG'iuqz~v\u0003w}1\u0007\u0003\u0004A6\u0007\u000b9\u0004\u0010<\u0007\u0012?\u000f\u0011\u0017C\r\u0007\u0019\f \u000b\u001d\u0011L\u0010\u0010\u0013\u001c\u0017\u0017", 243, 3));
                        f35334i = true;
                        return false;
                    }
                    f35333h = i3.getPrivate();
                    f35332g = i3.getPublic();
                }
                if (f35333h == null) {
                    return false;
                }
                f35330e = Math.min(instance.getCreationDate(C18114a.m62170f("r\u0012\u0016\u0015\u0017g\n\f\f\u0016\r\u000f\u001d~px", 230, 'I', 2)).getTime(), 1656633600000L);
                int e = m44083e();
                if ((e * (m44082d() + e)) % m44088j() != 0) {
                    f35336k = m44083e();
                    f35339n = m44083e();
                }
                f35331f = C18114a.m62167c("`ba__Y-", 181, 3).concat(C18114a.m62170f("ZY", 'L', 'H', 3).equalsIgnoreCase(f35333h.getAlgorithm()) ? C18114a.m62167c("~{{\nv", 178, 4) : f35333h.getAlgorithm()).toLowerCase(Locale.US);
                return true;
            } catch (IOException | CertificateException e2) {
                C11907h.m43612g(f35326a, C18114a.m62170f("Kht,x#npac\u001eqd`\u001aD]pIiceW\u0011kl", 'C', 202, 0), e2.toString());
                return false;
            } catch (KeyStoreException | NoSuchAlgorithmException e3) {
                C11907h.m43612g(f35326a, C18114a.m62167c("Lky3\u0002.\u0002u\u0006\u0005|y\f{7\u0004~\u0014;\u0003\u0010\u000e\r@l\b\u001dw\u001a\u0016\u001a\u000eI&)", 130, 1), e3.toString());
                return false;
            } catch (UnrecoverableEntryException e4) {
                C11907h.m43612g(f35326a, C18114a.m62167c("Yr\u0006Px}z\u0001&nw#ppt\u001fpb_jp^jXXaY\u0013mn", 'P', 2), e4.toString());
                return false;
            } catch (Throwable th) {
                C11907h.m43611f(f35326a, C18114a.m62167c("Ifr*v!ln_a\u001cob^\u0018B[nGgacU\u000f\u0016_aY^RUL\u0006J\\FGQTHMK\u0005zUV", 251, 4), th.toString());
                return false;
            }
        } else {
            C11907h.C11908a.m43624b(f35326a, C18114a.m62170f("s '\u001b\u0018\u001c2Y\"+1]/2*8$8*e(6-i;A/:83p=8M", 222, '-', 2));
            return true;
        }
    }

    /* renamed from: c */
    public static boolean m44081c(PrivateKey privateKey, String str) {
        if (!C11969r1.C11972c.m43952a()) {
            return true;
        }
        int i = f35336k;
        if ((i * (f35337l + i)) % f35338m != 0) {
            f35336k = 4;
            f35339n = m44083e();
        }
        int e = m44083e();
        if ((e * (f35337l + e)) % f35338m != 0) {
            f35336k = 4;
            f35339n = 6;
        }
        return C11911i.m43638a(privateKey, str);
    }

    /* renamed from: d */
    public static int m44082d() {
        return 1;
    }

    /* renamed from: e */
    public static int m44083e() {
        return 85;
    }

    /* renamed from: f */
    public static C17594k m44084f(String str, C17603t tVar, String str2) {
        String f;
        C17594k kVar = new C17594k();
        if (tVar == null || C11921k0.m43739v(str)) {
            kVar.f49288c = C18114a.m62167c("\u0007~\u000f\u0012z\u000b|u\t}wqz~\u0006oyuoiyiygr", 'u', 2);
            return kVar;
        } else if (f35334i || !m44080b(tVar.f49314a)) {
            C11907h.C11908a.m43624b(f35326a, C18114a.m62170f("\r*6m:d'5'\"4$]k[-\u001f-* \u001b+\u0019R|\u0016)~\u000f\u0016\u001eJ\u0010\u001b\u0017\u0014Eo\t\u001ct\u0015\u000f\u0011\u0003", 201, 147, 0));
            kVar.f49288c = C18114a.m62167c("%\u001d-\u001e0\u0019)\u001b\u0014'\u001c\u0016\u0010\u0016\u0010\u0017\u0019\u0011\u000f\t\u001d\u0017\u0006\r\n\u0012\b\u0014\u0002\u0014\u0004|\b\u0001\u0014\ny\u0001\t", 'k', 2);
            return kVar;
        } else if (f35333h == null || f35332g == null || f35331f == null) {
            C11907h.C11908a.m43624b(f35326a, C18114a.m62167c("\u0004*\u0018#!\u001cYi[\r0(6\"6(c\u0010+@g2=j:B:;}", 216, 3));
            kVar.f49288c = C18114a.m62170f("( 0!3\u001c,\u001e\u0017*\u001f\u0019\u0013\u001c '\u0011\u001b\u0017\u0011\u000b\u0016\u000f\"", 8, 'G', 0);
            return kVar;
        } else {
            String l = C11921k0.m43729l(10);
            String concat = l.concat(str).concat(String.valueOf(f35330e)).concat(f35331f).concat(str2);
            byte[] h = m44086h(concat);
            if (h != null) {
                String g = C11921k0.m43724g(h);
                String str3 = f35326a;
                C11907h.C11908a.m43624b(str3, C18114a.m62170f("ezw}sq,", 215, 148, 1) + concat + C18114a.m62170f("Ex\r\u001c\u001f\u0017 L\u0017\"O", 'y', 211, 2) + g);
                kVar.f49286a = g;
                kVar.f49287b = C11921k0.m43731n(l);
                kVar.f49290e = C11921k0.m43731n(String.valueOf(f35330e));
                kVar.f49289d = C11921k0.m43731n(f35331f);
                kVar.f49291f = C11921k0.m43724g(f35332g.getEncoded());
                int i = f35336k;
                if (((f35337l + i) * i) % f35338m != f35339n) {
                    f35336k = m44083e();
                    f35339n = 48;
                }
                kVar.f49292g = f35335j ? C18114a.m62167c("HGK<", 'F', 1) : "";
                f = null;
            } else {
                f = C18114a.m62170f("tn\u0001s\br\u0005xs\t{w\b\u0010\b\t|\u0012\t\b\u0010\u0004\u0018\u001a\u0018\f", 'J', 192, 3);
            }
            kVar.f49288c = f;
            return kVar;
        }
    }

    /* renamed from: g */
    public static boolean m44085g(PrivateKey privateKey, String str) {
        if (privateKey == null) {
            return false;
        }
        try {
            boolean a = C11969r1.C11972c.m43952a();
            int i = f35336k;
            if ((i * (f35337l + i)) % f35338m != 0) {
                f35336k = m44083e();
                f35339n = 7;
            }
            if (a) {
                return C11911i.m43642e(privateKey, str);
            }
            if (C11969r1.C11983n.C11984a.f35247c < C11969r1.C11983n.C11985b.f35264p && C11969r1.C11972c.m43954c()) {
                return KeyChain.isBoundKeyAlgorithm(privateKey.getAlgorithm());
            }
            return false;
        } catch (Throwable th) {
            String str2 = f35326a;
            String f = C18114a.m62170f("\u001f-f5a&,*)2g4/Dk=@>@6DG=:IvKOIPFKDFZFIUZPWW\u0013\u000bgj", 'Q', 'j', 3);
            int i2 = f35336k;
            if (((f35337l + i2) * i2) % f35338m != f35339n) {
                f35336k = m44083e();
                f35339n = m44083e();
            }
            C11907h.m43611f(str2, f, th.toString());
        }
    }

    /* renamed from: h */
    private static byte[] m44086h(String str) {
        try {
            if (!C11969r1.C11972c.m43953b()) {
                C11907h.C11908a.m43624b(f35326a, C18114a.m62170f("/LX\u0010\\\u0007YNKQ\u000e\u0001RDOREM?=w:B6GF7Do0@2k99=g(<&-/##,$k", 'W', 'C', 0));
                return null;
            }
            if (f35333h == null) {
                KeyStore instance = KeyStore.getInstance(C18114a.m62167c("Codqmf`F_rKkegY", 253, 4));
                instance.load((KeyStore.LoadStoreParameter) null);
                int i = f35336k;
                if ((i * (f35337l + i)) % f35338m != 0) {
                    f35336k = m44083e();
                    f35339n = m44083e();
                }
                KeyStore.Entry entry = instance.getEntry(C18114a.m62170f("2QUTV'IKKULN\\>08", 246, 228, 3), (KeyStore.ProtectionParameter) null);
                if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                    return null;
                }
                f35333h = ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
            }
            Signature instance2 = Signature.getInstance(C18114a.m62167c("wt", 204, 5).equalsIgnoreCase(f35333h.getAlgorithm()) ? C18114a.m62170f("f\\VHLN\u0011\u0004\u0010\u0005bacsb", 'i', ')', 3) : C18114a.m62170f("!\u0015\r|~~?0:-\u0016\u0016\u0003", 226, '1', 0));
            instance2.initSign(f35333h);
            instance2.update(str.getBytes());
            return instance2.sign();
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | SignatureException | UnrecoverableEntryException | CertificateException e) {
            String str2 = f35326a;
            int i2 = f35336k;
            if ((i2 * (f35337l + i2)) % f35338m != 0) {
                f35336k = 19;
                f35339n = 88;
            }
            C11907h.m43612g(str2, C18114a.m62170f("\u00110>wFrG>=EwMB@{FLOUU\u0002^a", ':', 235, 2), e.toString());
            return null;
        } catch (Throwable th) {
            C11907h.m43611f(f35326a, C18114a.m62167c("On|6\u00051\u0006|{\u00046\f\u0001~:\u0005\u000b\u000e\u0014\u0014@I\u0015\u0019\u0013\u001a\u0010\u0015\u000eI\u0010$\u0010\u0013\u001f$\u001a!!\\T14", 131, 1), th.toString());
            return null;
        }
    }

    /* renamed from: i */
    public static KeyPair m44087i(String str, Context context, String str2, String str3) {
        if (!KeyChain.isKeyAlgorithmSupported(str)) {
            return null;
        }
        try {
            if (C11969r1.C11972c.m43952a()) {
                return C11911i.m43639b(str, str2, str3);
            }
            if (C11969r1.C11983n.C11984a.f35247c >= C11969r1.C11983n.C11985b.f35264p || !C11969r1.C11972c.m43954c()) {
                int i = f35336k;
                if ((i * (f35337l + i)) % f35338m != 0) {
                    f35336k = 81;
                    f35339n = m44083e();
                }
                return null;
            }
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 99);
            KeyPairGeneratorSpec.Builder keyType = new KeyPairGeneratorSpec.Builder(context).setAlias(str3).setSubject(new X500Principal(C18114a.m62170f("HTD\\{~\u0001Qsuuvx\u0007hZb8hWo\u0005\u0010\u0004\u0001\u0015n\b\u0018\u0017\u000f\u001f", 'o', 233, 2))).setSerialNumber(BigInteger.TEN).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).setKeyType(str);
            KeyPairGenerator instance3 = KeyPairGenerator.getInstance(str, str2);
            instance3.initialize(keyType.build());
            return instance3.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchProviderException e) {
            C11907h.m43612g(f35326a, C18114a.m62167c("\u00143AzIu:J>;OA|)DY1CLV\u0005ad", 'P', 0), e.toString());
        } catch (NoSuchAlgorithmException e2) {
            C11907h.C11908a.m43625c(f35326a, C18114a.m62170f("q\u0011\u001fX'S\u0018(\u001c\u0019-\u001fZ\u0007\"7\u000f!*4b?B", 145, 155, 3), e2.toString());
        } catch (Exception unused) {
            f35336k = 4;
        } catch (Throwable th) {
            C11907h.m43611f(f35326a, C18114a.m62167c("7Vd\u001el\u0019]ma^rd Lg|Tfoy()2}\u0002{\u0003x}v2x\rx{\b\r\u0003\n\nE=\u001a\u001d", 248, 3), th.toString());
            throw null;
        }
    }

    /* renamed from: j */
    public static int m44088j() {
        return 2;
    }

    /* renamed from: k */
    public static boolean m44089k(Context context) {
        if (!f35334i) {
            return m44080b(context);
        }
        int i = f35336k;
        if (((f35337l + i) * i) % f35338m == f35339n) {
            return false;
        }
        int e = m44083e();
        if ((e * (m44082d() + e)) % f35338m != 0) {
            f35336k = 18;
            f35339n = 85;
        }
        f35336k = 87;
        f35339n = 27;
        return false;
    }
}
