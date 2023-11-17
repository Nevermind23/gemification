package zh1;

import ci1.C40453a;
import ci1.C40454b;
import ci1.C40455c;
import ci1.C40456d;
import ci1.C40457e;
import ci1.C40458f;
import ci1.C40459g;
import ci1.C40460h;
import ci1.C40461i;
import ci1.C40462j;
import ci1.C40463k;
import ci1.C40464l;
import ci1.C40465m;
import ci1.C40466n;
import ci1.C40467o;
import ci1.C40468p;
import ci1.C40469q;
import ci1.C40470r;
import ci1.C40471s;
import ci1.C40472t;
import ci1.C40473u;
import ci1.C40474v;
import ci1.C40476x;
import ci1.C40477y;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import of1.C41869b0;
import of1.C41928u;
import of1.C41931v;
import of1.C41937x;
import of1.C41939y;
import zh1.C43484q;

/* renamed from: zh1.u */
final class C43508u {

    /* renamed from: a */
    private final Method f101433a;

    /* renamed from: b */
    private final C41931v f101434b;

    /* renamed from: c */
    final String f101435c;

    /* renamed from: d */
    private final String f101436d;

    /* renamed from: e */
    private final C41928u f101437e;

    /* renamed from: f */
    private final C41937x f101438f;

    /* renamed from: g */
    private final boolean f101439g;

    /* renamed from: h */
    private final boolean f101440h;

    /* renamed from: i */
    private final boolean f101441i;

    /* renamed from: j */
    private final C43484q[] f101442j;

    /* renamed from: k */
    final boolean f101443k;

    /* renamed from: zh1.u$a */
    static final class C43509a {

        /* renamed from: x */
        private static final Pattern f101444x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        private static final Pattern f101445y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final C43511w f101446a;

        /* renamed from: b */
        final Method f101447b;

        /* renamed from: c */
        final Annotation[] f101448c;

        /* renamed from: d */
        final Annotation[][] f101449d;

        /* renamed from: e */
        final Type[] f101450e;

        /* renamed from: f */
        boolean f101451f;

        /* renamed from: g */
        boolean f101452g;

        /* renamed from: h */
        boolean f101453h;

        /* renamed from: i */
        boolean f101454i;

        /* renamed from: j */
        boolean f101455j;

        /* renamed from: k */
        boolean f101456k;

        /* renamed from: l */
        boolean f101457l;

        /* renamed from: m */
        boolean f101458m;

        /* renamed from: n */
        String f101459n;

        /* renamed from: o */
        boolean f101460o;

        /* renamed from: p */
        boolean f101461p;

        /* renamed from: q */
        boolean f101462q;

        /* renamed from: r */
        String f101463r;

        /* renamed from: s */
        C41928u f101464s;

        /* renamed from: t */
        C41937x f101465t;

        /* renamed from: u */
        Set f101466u;

        /* renamed from: v */
        C43484q[] f101467v;

        /* renamed from: w */
        boolean f101468w;

        C43509a(C43511w wVar, Method method) {
            this.f101446a = wVar;
            this.f101447b = method;
            this.f101448c = method.getAnnotations();
            this.f101450e = method.getGenericParameterTypes();
            this.f101449d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        private static Class m124765a(Class cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        /* renamed from: c */
        private C41928u m124766c(String[] strArr) {
            C41928u.C41929a aVar = new C41928u.C41929a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw C43439a0.m124625m(this.f101447b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f101465t = C41937x.m121708e(trim);
                    } catch (IllegalArgumentException e) {
                        throw C43439a0.m124626n(this.f101447b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo96936a(substring, trim);
                }
            }
            return aVar.mo96941f();
        }

        /* renamed from: d */
        private void m124767d(String str, String str2, boolean z) {
            String str3 = this.f101459n;
            if (str3 == null) {
                this.f101459n = str;
                this.f101460o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f101444x.matcher(substring).find()) {
                            throw C43439a0.m124625m(this.f101447b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f101463r = str2;
                    this.f101466u = m124771h(str2);
                    return;
                }
                return;
            }
            throw C43439a0.m124625m(this.f101447b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        private void m124768e(Annotation annotation) {
            if (annotation instanceof C40454b) {
                m124767d("DELETE", ((C40454b) annotation).value(), false);
            } else if (annotation instanceof C40458f) {
                m124767d("GET", ((C40458f) annotation).value(), false);
            } else if (annotation instanceof C40459g) {
                m124767d("HEAD", ((C40459g) annotation).value(), false);
            } else if (annotation instanceof C40466n) {
                m124767d("PATCH", ((C40466n) annotation).value(), true);
            } else if (annotation instanceof C40467o) {
                m124767d("POST", ((C40467o) annotation).value(), true);
            } else if (annotation instanceof C40468p) {
                m124767d(Request.PUT, ((C40468p) annotation).value(), true);
            } else if (annotation instanceof C40465m) {
                m124767d("OPTIONS", ((C40465m) annotation).value(), false);
            } else if (annotation instanceof C40460h) {
                C40460h hVar = (C40460h) annotation;
                m124767d(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation instanceof C40463k) {
                String[] value = ((C40463k) annotation).value();
                if (value.length != 0) {
                    this.f101464s = m124766c(value);
                    return;
                }
                throw C43439a0.m124625m(this.f101447b, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof C40464l) {
                if (!this.f101461p) {
                    this.f101462q = true;
                    return;
                }
                throw C43439a0.m124625m(this.f101447b, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof C40457e)) {
            } else {
                if (!this.f101462q) {
                    this.f101461p = true;
                    return;
                }
                throw C43439a0.m124625m(this.f101447b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /* renamed from: f */
        private C43484q m124769f(int i, Type type, Annotation[] annotationArr, boolean z) {
            C43484q qVar;
            if (annotationArr != null) {
                qVar = null;
                for (Annotation g : annotationArr) {
                    C43484q g2 = m124770g(i, type, annotationArr, g);
                    if (g2 != null) {
                        if (qVar == null) {
                            qVar = g2;
                        } else {
                            throw C43439a0.m124627o(this.f101447b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                qVar = null;
            }
            if (qVar != null) {
                return qVar;
            }
            if (z) {
                try {
                    if (C43439a0.m124620h(type) == Continuation.class) {
                        this.f101468w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C43439a0.m124627o(this.f101447b, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        private C43484q m124770g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            if (annotation instanceof C40477y) {
                m124773j(i, type);
                if (this.f101458m) {
                    throw C43439a0.m124627o(this.f101447b, i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f101454i) {
                    throw C43439a0.m124627o(this.f101447b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f101455j) {
                    throw C43439a0.m124627o(this.f101447b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f101456k) {
                    throw C43439a0.m124627o(this.f101447b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f101457l) {
                    throw C43439a0.m124627o(this.f101447b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f101463r == null) {
                    this.f101458m = true;
                    if (type == C41931v.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new C43484q.C43500p(this.f101447b, i);
                    }
                    throw C43439a0.m124627o(this.f101447b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw C43439a0.m124627o(this.f101447b, i, "@Url cannot be used with @%s URL", this.f101459n);
                }
            } else if (annotation instanceof C40471s) {
                m124773j(i, type);
                if (this.f101455j) {
                    throw C43439a0.m124627o(this.f101447b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f101456k) {
                    throw C43439a0.m124627o(this.f101447b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f101457l) {
                    throw C43439a0.m124627o(this.f101447b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f101458m) {
                    throw C43439a0.m124627o(this.f101447b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f101463r != null) {
                    this.f101454i = true;
                    C40471s sVar = (C40471s) annotation;
                    String value = sVar.value();
                    m124772i(i, value);
                    return new C43484q.C43495k(this.f101447b, i, value, this.f101446a.mo102228j(type, annotationArr), sVar.encoded());
                } else {
                    throw C43439a0.m124627o(this.f101447b, i, "@Path can only be used with relative url on @%s", this.f101459n);
                }
            } else {
                Class<Iterable> cls2 = Iterable.class;
                if (annotation instanceof C40472t) {
                    m124773j(i, type);
                    C40472t tVar = (C40472t) annotation;
                    String value2 = tVar.value();
                    boolean encoded = tVar.encoded();
                    Class h = C43439a0.m124620h(type);
                    this.f101455j = true;
                    if (cls2.isAssignableFrom(h)) {
                        if (type instanceof ParameterizedType) {
                            return new C43484q.C43496l(value2, this.f101446a.mo102228j(C43439a0.m124619g(0, (ParameterizedType) type), annotationArr), encoded).mo102185c();
                        }
                        throw C43439a0.m124627o(this.f101447b, i, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h.isArray()) {
                        return new C43484q.C43496l(value2, this.f101446a.mo102228j(type, annotationArr), encoded);
                    } else {
                        return new C43484q.C43496l(value2, this.f101446a.mo102228j(m124765a(h.getComponentType()), annotationArr), encoded).mo102184b();
                    }
                } else if (annotation instanceof C40474v) {
                    m124773j(i, type);
                    boolean encoded2 = ((C40474v) annotation).encoded();
                    Class h2 = C43439a0.m124620h(type);
                    this.f101456k = true;
                    if (cls2.isAssignableFrom(h2)) {
                        if (type instanceof ParameterizedType) {
                            return new C43484q.C43498n(this.f101446a.mo102228j(C43439a0.m124619g(0, (ParameterizedType) type), annotationArr), encoded2).mo102185c();
                        }
                        throw C43439a0.m124627o(this.f101447b, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h2.isArray()) {
                        return new C43484q.C43498n(this.f101446a.mo102228j(type, annotationArr), encoded2);
                    } else {
                        return new C43484q.C43498n(this.f101446a.mo102228j(m124765a(h2.getComponentType()), annotationArr), encoded2).mo102184b();
                    }
                } else {
                    Class<Map> cls3 = Map.class;
                    if (annotation instanceof C40473u) {
                        m124773j(i, type);
                        Class h3 = C43439a0.m124620h(type);
                        this.f101457l = true;
                        if (cls3.isAssignableFrom(h3)) {
                            Type i2 = C43439a0.m124621i(type, h3, cls3);
                            if (i2 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) i2;
                                Type g = C43439a0.m124619g(0, parameterizedType);
                                if (cls == g) {
                                    return new C43484q.C43497m(this.f101447b, i, this.f101446a.mo102228j(C43439a0.m124619g(1, parameterizedType), annotationArr), ((C40473u) annotation).encoded());
                                }
                                throw C43439a0.m124627o(this.f101447b, i, "@QueryMap keys must be of type String: " + g, new Object[0]);
                            }
                            throw C43439a0.m124627o(this.f101447b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw C43439a0.m124627o(this.f101447b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof C40461i) {
                        m124773j(i, type);
                        String value3 = ((C40461i) annotation).value();
                        Class h4 = C43439a0.m124620h(type);
                        if (cls2.isAssignableFrom(h4)) {
                            if (type instanceof ParameterizedType) {
                                return new C43484q.C43490f(value3, this.f101446a.mo102228j(C43439a0.m124619g(0, (ParameterizedType) type), annotationArr)).mo102185c();
                            }
                            throw C43439a0.m124627o(this.f101447b, i, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!h4.isArray()) {
                            return new C43484q.C43490f(value3, this.f101446a.mo102228j(type, annotationArr));
                        } else {
                            return new C43484q.C43490f(value3, this.f101446a.mo102228j(m124765a(h4.getComponentType()), annotationArr)).mo102184b();
                        }
                    } else if (annotation instanceof C40462j) {
                        if (type == C41928u.class) {
                            return new C43484q.C43492h(this.f101447b, i);
                        }
                        m124773j(i, type);
                        Class h5 = C43439a0.m124620h(type);
                        if (cls3.isAssignableFrom(h5)) {
                            Type i3 = C43439a0.m124621i(type, h5, cls3);
                            if (i3 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                                Type g2 = C43439a0.m124619g(0, parameterizedType2);
                                if (cls == g2) {
                                    return new C43484q.C43491g(this.f101447b, i, this.f101446a.mo102228j(C43439a0.m124619g(1, parameterizedType2), annotationArr));
                                }
                                throw C43439a0.m124627o(this.f101447b, i, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
                            }
                            throw C43439a0.m124627o(this.f101447b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw C43439a0.m124627o(this.f101447b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof C40455c) {
                        m124773j(i, type);
                        if (this.f101461p) {
                            C40455c cVar = (C40455c) annotation;
                            String value4 = cVar.value();
                            boolean encoded3 = cVar.encoded();
                            this.f101451f = true;
                            Class h6 = C43439a0.m124620h(type);
                            if (cls2.isAssignableFrom(h6)) {
                                if (type instanceof ParameterizedType) {
                                    return new C43484q.C43488d(value4, this.f101446a.mo102228j(C43439a0.m124619g(0, (ParameterizedType) type), annotationArr), encoded3).mo102185c();
                                }
                                throw C43439a0.m124627o(this.f101447b, i, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                            } else if (!h6.isArray()) {
                                return new C43484q.C43488d(value4, this.f101446a.mo102228j(type, annotationArr), encoded3);
                            } else {
                                return new C43484q.C43488d(value4, this.f101446a.mo102228j(m124765a(h6.getComponentType()), annotationArr), encoded3).mo102184b();
                            }
                        } else {
                            throw C43439a0.m124627o(this.f101447b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof C40456d) {
                        m124773j(i, type);
                        if (this.f101461p) {
                            Class h7 = C43439a0.m124620h(type);
                            if (cls3.isAssignableFrom(h7)) {
                                Type i4 = C43439a0.m124621i(type, h7, cls3);
                                if (i4 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                                    Type g3 = C43439a0.m124619g(0, parameterizedType3);
                                    if (cls == g3) {
                                        C43455h j = this.f101446a.mo102228j(C43439a0.m124619g(1, parameterizedType3), annotationArr);
                                        this.f101451f = true;
                                        return new C43484q.C43489e(this.f101447b, i, j, ((C40456d) annotation).encoded());
                                    }
                                    throw C43439a0.m124627o(this.f101447b, i, "@FieldMap keys must be of type String: " + g3, new Object[0]);
                                }
                                throw C43439a0.m124627o(this.f101447b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                            throw C43439a0.m124627o(this.f101447b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        throw C43439a0.m124627o(this.f101447b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                    } else {
                        Class<C41939y.C41942c> cls4 = C41939y.C41942c.class;
                        if (annotation instanceof C40469q) {
                            m124773j(i, type);
                            if (this.f101462q) {
                                C40469q qVar = (C40469q) annotation;
                                this.f101452g = true;
                                String value5 = qVar.value();
                                Class h8 = C43439a0.m124620h(type);
                                if (!value5.isEmpty()) {
                                    C41928u l = C41928u.m121597l("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                                    if (cls2.isAssignableFrom(h8)) {
                                        if (type instanceof ParameterizedType) {
                                            Type g4 = C43439a0.m124619g(0, (ParameterizedType) type);
                                            if (!cls4.isAssignableFrom(C43439a0.m124620h(g4))) {
                                                return new C43484q.C43493i(this.f101447b, i, l, this.f101446a.mo102226h(g4, annotationArr, this.f101448c)).mo102185c();
                                            }
                                            throw C43439a0.m124627o(this.f101447b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                        }
                                        throw C43439a0.m124627o(this.f101447b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (h8.isArray()) {
                                        Class a = m124765a(h8.getComponentType());
                                        if (!cls4.isAssignableFrom(a)) {
                                            return new C43484q.C43493i(this.f101447b, i, l, this.f101446a.mo102226h(a, annotationArr, this.f101448c)).mo102184b();
                                        }
                                        throw C43439a0.m124627o(this.f101447b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    } else if (!cls4.isAssignableFrom(h8)) {
                                        return new C43484q.C43493i(this.f101447b, i, l, this.f101446a.mo102226h(type, annotationArr, this.f101448c));
                                    } else {
                                        throw C43439a0.m124627o(this.f101447b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    }
                                } else if (cls2.isAssignableFrom(h8)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw C43439a0.m124627o(this.f101447b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (cls4.isAssignableFrom(C43439a0.m124620h(C43439a0.m124619g(0, (ParameterizedType) type)))) {
                                        return C43484q.C43499o.f101410a.mo102185c();
                                    } else {
                                        throw C43439a0.m124627o(this.f101447b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                    }
                                } else if (h8.isArray()) {
                                    if (cls4.isAssignableFrom(h8.getComponentType())) {
                                        return C43484q.C43499o.f101410a.mo102184b();
                                    }
                                    throw C43439a0.m124627o(this.f101447b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                } else if (cls4.isAssignableFrom(h8)) {
                                    return C43484q.C43499o.f101410a;
                                } else {
                                    throw C43439a0.m124627o(this.f101447b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                }
                            } else {
                                throw C43439a0.m124627o(this.f101447b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof C40470r) {
                            m124773j(i, type);
                            if (this.f101462q) {
                                this.f101452g = true;
                                Class h9 = C43439a0.m124620h(type);
                                if (cls3.isAssignableFrom(h9)) {
                                    Type i5 = C43439a0.m124621i(type, h9, cls3);
                                    if (i5 instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType4 = (ParameterizedType) i5;
                                        Type g5 = C43439a0.m124619g(0, parameterizedType4);
                                        if (cls == g5) {
                                            Type g6 = C43439a0.m124619g(1, parameterizedType4);
                                            if (!cls4.isAssignableFrom(C43439a0.m124620h(g6))) {
                                                return new C43484q.C43494j(this.f101447b, i, this.f101446a.mo102226h(g6, annotationArr, this.f101448c), ((C40470r) annotation).encoding());
                                            }
                                            throw C43439a0.m124627o(this.f101447b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                        }
                                        throw C43439a0.m124627o(this.f101447b, i, "@PartMap keys must be of type String: " + g5, new Object[0]);
                                    }
                                    throw C43439a0.m124627o(this.f101447b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                                throw C43439a0.m124627o(this.f101447b, i, "@PartMap parameter type must be Map.", new Object[0]);
                            }
                            throw C43439a0.m124627o(this.f101447b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        } else if (annotation instanceof C40453a) {
                            m124773j(i, type);
                            if (this.f101461p || this.f101462q) {
                                throw C43439a0.m124627o(this.f101447b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                            } else if (!this.f101453h) {
                                try {
                                    C43455h h12 = this.f101446a.mo102226h(type, annotationArr, this.f101448c);
                                    this.f101453h = true;
                                    return new C43484q.C43487c(this.f101447b, i, h12);
                                } catch (RuntimeException e) {
                                    throw C43439a0.m124628p(this.f101447b, e, i, "Unable to create @Body converter for %s", type);
                                }
                            } else {
                                throw C43439a0.m124627o(this.f101447b, i, "Multiple @Body method annotations found.", new Object[0]);
                            }
                        } else if (!(annotation instanceof C40476x)) {
                            return null;
                        } else {
                            m124773j(i, type);
                            Class h13 = C43439a0.m124620h(type);
                            int i6 = i - 1;
                            while (i6 >= 0) {
                                C43484q qVar2 = this.f101467v[i6];
                                if (!(qVar2 instanceof C43484q.C43501q) || !((C43484q.C43501q) qVar2).f101413a.equals(h13)) {
                                    i6--;
                                } else {
                                    throw C43439a0.m124627o(this.f101447b, i, "@Tag type " + h13.getName() + " is duplicate of parameter #" + (i6 + 1) + " and would always overwrite its value.", new Object[0]);
                                }
                            }
                            return new C43484q.C43501q(h13);
                        }
                    }
                }
            }
        }

        /* renamed from: h */
        static Set m124771h(String str) {
            Matcher matcher = f101444x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: i */
        private void m124772i(int i, String str) {
            if (!f101445y.matcher(str).matches()) {
                throw C43439a0.m124627o(this.f101447b, i, "@Path parameter name must match %s. Found: %s", f101444x.pattern(), str);
            } else if (!this.f101466u.contains(str)) {
                throw C43439a0.m124627o(this.f101447b, i, "URL \"%s\" does not contain \"{%s}\".", this.f101463r, str);
            }
        }

        /* renamed from: j */
        private void m124773j(int i, Type type) {
            if (C43439a0.m124622j(type)) {
                throw C43439a0.m124627o(this.f101447b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C43508u mo102213b() {
            for (Annotation e : this.f101448c) {
                m124768e(e);
            }
            if (this.f101459n != null) {
                if (!this.f101460o) {
                    if (this.f101462q) {
                        throw C43439a0.m124625m(this.f101447b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f101461p) {
                        throw C43439a0.m124625m(this.f101447b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f101449d.length;
                this.f101467v = new C43484q[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    C43484q[] qVarArr = this.f101467v;
                    Type type = this.f101450e[i2];
                    Annotation[] annotationArr = this.f101449d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    qVarArr[i2] = m124769f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f101463r != null || this.f101458m) {
                    boolean z2 = this.f101461p;
                    if (!z2 && !this.f101462q && !this.f101460o && this.f101453h) {
                        throw C43439a0.m124625m(this.f101447b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !this.f101451f) {
                        throw C43439a0.m124625m(this.f101447b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f101462q || this.f101452g) {
                        return new C43508u(this);
                    } else {
                        throw C43439a0.m124625m(this.f101447b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw C43439a0.m124625m(this.f101447b, "Missing either @%s URL or @Url parameter.", this.f101459n);
                }
            } else {
                throw C43439a0.m124625m(this.f101447b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }

    C43508u(C43509a aVar) {
        this.f101433a = aVar.f101447b;
        this.f101434b = aVar.f101446a.f101474c;
        this.f101435c = aVar.f101459n;
        this.f101436d = aVar.f101463r;
        this.f101437e = aVar.f101464s;
        this.f101438f = aVar.f101465t;
        this.f101439g = aVar.f101460o;
        this.f101440h = aVar.f101461p;
        this.f101441i = aVar.f101462q;
        this.f101442j = aVar.f101467v;
        this.f101443k = aVar.f101468w;
    }

    /* renamed from: b */
    static C43508u m124763b(C43511w wVar, Method method) {
        return new C43509a(wVar, method).mo102213b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C41869b0 mo102212a(Object[] objArr) {
        C43484q[] qVarArr = this.f101442j;
        int length = objArr.length;
        if (length == qVarArr.length) {
            C43506t tVar = new C43506t(this.f101435c, this.f101434b, this.f101436d, this.f101437e, this.f101438f, this.f101439g, this.f101440h, this.f101441i);
            if (this.f101443k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                qVarArr[i].mo102183a(tVar, objArr[i]);
            }
            return tVar.mo102209k().mo96703u(C43467m.class, new C43467m(this.f101433a, arrayList)).mo96684b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + qVarArr.length + ")");
    }
}
