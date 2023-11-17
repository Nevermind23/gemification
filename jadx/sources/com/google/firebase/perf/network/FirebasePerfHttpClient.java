package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import p147ka.C6851h;
import p173ma.C7151e;
import p173ma.C7152f;
import p199oa.C7506k;

public class FirebasePerfHttpClient {
    /* renamed from: a */
    static Object m21454a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, Timer timer, C7506k kVar) {
        C6851h d = C6851h.m26596d(kVar);
        try {
            d.mo20920w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo20910k(httpRequest.getRequestLine().getMethod());
            Long a = C7152f.m27524a(httpRequest);
            if (a != null) {
                d.mo20913p(a.longValue());
            }
            timer.mo18044h();
            d.mo20914q(timer.mo18043f());
            return httpClient.execute(httpHost, httpRequest, new C7151e(responseHandler, timer, d));
        } catch (IOException e) {
            d.mo20918u(timer.mo18040d());
            C7152f.m27527d(d);
            throw e;
        }
    }

    /* renamed from: b */
    static Object m21455b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, C7506k kVar) {
        C6851h d = C6851h.m26596d(kVar);
        try {
            d.mo20920w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo20910k(httpRequest.getRequestLine().getMethod());
            Long a = C7152f.m27524a(httpRequest);
            if (a != null) {
                d.mo20913p(a.longValue());
            }
            timer.mo18044h();
            d.mo20914q(timer.mo18043f());
            return httpClient.execute(httpHost, httpRequest, new C7151e(responseHandler, timer, d), httpContext);
        } catch (IOException e) {
            d.mo20918u(timer.mo18040d());
            C7152f.m27527d(d);
            throw e;
        }
    }

    /* renamed from: c */
    static Object m21456c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, Timer timer, C7506k kVar) {
        C6851h d = C6851h.m26596d(kVar);
        try {
            d.mo20920w(httpUriRequest.getURI().toString()).mo20910k(httpUriRequest.getMethod());
            Long a = C7152f.m27524a(httpUriRequest);
            if (a != null) {
                d.mo20913p(a.longValue());
            }
            timer.mo18044h();
            d.mo20914q(timer.mo18043f());
            return httpClient.execute(httpUriRequest, new C7151e(responseHandler, timer, d));
        } catch (IOException e) {
            d.mo20918u(timer.mo18040d());
            C7152f.m27527d(d);
            throw e;
        }
    }

    /* renamed from: d */
    static Object m21457d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext, Timer timer, C7506k kVar) {
        C6851h d = C6851h.m26596d(kVar);
        try {
            d.mo20920w(httpUriRequest.getURI().toString()).mo20910k(httpUriRequest.getMethod());
            Long a = C7152f.m27524a(httpUriRequest);
            if (a != null) {
                d.mo20913p(a.longValue());
            }
            timer.mo18044h();
            d.mo20914q(timer.mo18043f());
            return httpClient.execute(httpUriRequest, new C7151e(responseHandler, timer, d), httpContext);
        } catch (IOException e) {
            d.mo20918u(timer.mo18040d());
            C7152f.m27527d(d);
            throw e;
        }
    }

    /* renamed from: e */
    static HttpResponse m21458e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, C7506k kVar) {
        C6851h d = C6851h.m26596d(kVar);
        try {
            d.mo20920w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo20910k(httpRequest.getRequestLine().getMethod());
            Long a = C7152f.m27524a(httpRequest);
            if (a != null) {
                d.mo20913p(a.longValue());
            }
            timer.mo18044h();
            d.mo20914q(timer.mo18043f());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            d.mo20918u(timer.mo18040d());
            d.mo20911l(execute.getStatusLine().getStatusCode());
            Long a2 = C7152f.m27524a(execute);
            if (a2 != null) {
                d.mo20916s(a2.longValue());
            }
            String b = C7152f.m27525b(execute);
            if (b != null) {
                d.mo20915r(b);
            }
            d.mo20906b();
            return execute;
        } catch (IOException e) {
            d.mo20918u(timer.mo18040d());
            C7152f.m27527d(d);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return m21460g(httpClient, httpUriRequest, new Timer(), C7506k.m28498k());
    }

    /* renamed from: f */
    static HttpResponse m21459f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, C7506k kVar) {
        C6851h d = C6851h.m26596d(kVar);
        try {
            d.mo20920w(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo20910k(httpRequest.getRequestLine().getMethod());
            Long a = C7152f.m27524a(httpRequest);
            if (a != null) {
                d.mo20913p(a.longValue());
            }
            timer.mo18044h();
            d.mo20914q(timer.mo18043f());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            d.mo20918u(timer.mo18040d());
            d.mo20911l(execute.getStatusLine().getStatusCode());
            Long a2 = C7152f.m27524a(execute);
            if (a2 != null) {
                d.mo20916s(a2.longValue());
            }
            String b = C7152f.m27525b(execute);
            if (b != null) {
                d.mo20915r(b);
            }
            d.mo20906b();
            return execute;
        } catch (IOException e) {
            d.mo20918u(timer.mo18040d());
            C7152f.m27527d(d);
            throw e;
        }
    }

    /* renamed from: g */
    static HttpResponse m21460g(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, C7506k kVar) {
        C6851h d = C6851h.m26596d(kVar);
        try {
            d.mo20920w(httpUriRequest.getURI().toString()).mo20910k(httpUriRequest.getMethod());
            Long a = C7152f.m27524a(httpUriRequest);
            if (a != null) {
                d.mo20913p(a.longValue());
            }
            timer.mo18044h();
            d.mo20914q(timer.mo18043f());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            d.mo20918u(timer.mo18040d());
            d.mo20911l(execute.getStatusLine().getStatusCode());
            Long a2 = C7152f.m27524a(execute);
            if (a2 != null) {
                d.mo20916s(a2.longValue());
            }
            String b = C7152f.m27525b(execute);
            if (b != null) {
                d.mo20915r(b);
            }
            d.mo20906b();
            return execute;
        } catch (IOException e) {
            d.mo20918u(timer.mo18040d());
            C7152f.m27527d(d);
            throw e;
        }
    }

    /* renamed from: h */
    static HttpResponse m21461h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, C7506k kVar) {
        C6851h d = C6851h.m26596d(kVar);
        try {
            d.mo20920w(httpUriRequest.getURI().toString()).mo20910k(httpUriRequest.getMethod());
            Long a = C7152f.m27524a(httpUriRequest);
            if (a != null) {
                d.mo20913p(a.longValue());
            }
            timer.mo18044h();
            d.mo20914q(timer.mo18043f());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            d.mo20918u(timer.mo18040d());
            d.mo20911l(execute.getStatusLine().getStatusCode());
            Long a2 = C7152f.m27524a(execute);
            if (a2 != null) {
                d.mo20916s(a2.longValue());
            }
            String b = C7152f.m27525b(execute);
            if (b != null) {
                d.mo20915r(b);
            }
            d.mo20906b();
            return execute;
        } catch (IOException e) {
            d.mo20918u(timer.mo18040d());
            C7152f.m27527d(d);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return m21461h(httpClient, httpUriRequest, httpContext, new Timer(), C7506k.m28498k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return m21456c(httpClient, httpUriRequest, responseHandler, new Timer(), C7506k.m28498k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return m21457d(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), C7506k.m28498k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return m21458e(httpClient, httpHost, httpRequest, new Timer(), C7506k.m28498k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return m21459f(httpClient, httpHost, httpRequest, httpContext, new Timer(), C7506k.m28498k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return m21454a(httpClient, httpHost, httpRequest, responseHandler, new Timer(), C7506k.m28498k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return m21455b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), C7506k.m28498k());
    }
}
