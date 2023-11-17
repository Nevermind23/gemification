package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p147ka.C6851h;

/* renamed from: com.google.firebase.perf.network.b */
public final class C5415b extends HttpsURLConnection {

    /* renamed from: a */
    private final C5416c f17263a;

    /* renamed from: b */
    private final HttpsURLConnection f17264b;

    C5415b(HttpsURLConnection httpsURLConnection, Timer timer, C6851h hVar) {
        super(httpsURLConnection.getURL());
        this.f17264b = httpsURLConnection;
        this.f17263a = new C5416c(httpsURLConnection, timer, hVar);
    }

    public void addRequestProperty(String str, String str2) {
        this.f17263a.mo17967a(str, str2);
    }

    public void connect() {
        this.f17263a.mo17968b();
    }

    public void disconnect() {
        this.f17263a.mo17970c();
    }

    public boolean equals(Object obj) {
        return this.f17263a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f17263a.mo17971d();
    }

    public String getCipherSuite() {
        return this.f17264b.getCipherSuite();
    }

    public int getConnectTimeout() {
        return this.f17263a.mo17972e();
    }

    public Object getContent() {
        return this.f17263a.mo17974f();
    }

    public String getContentEncoding() {
        return this.f17263a.mo17976h();
    }

    public int getContentLength() {
        return this.f17263a.mo17978i();
    }

    public long getContentLengthLong() {
        return this.f17263a.mo17979j();
    }

    public String getContentType() {
        return this.f17263a.mo17980k();
    }

    public long getDate() {
        return this.f17263a.mo17981l();
    }

    public boolean getDefaultUseCaches() {
        return this.f17263a.mo17982m();
    }

    public boolean getDoInput() {
        return this.f17263a.mo17983n();
    }

    public boolean getDoOutput() {
        return this.f17263a.mo17984o();
    }

    public InputStream getErrorStream() {
        return this.f17263a.mo17985p();
    }

    public long getExpiration() {
        return this.f17263a.mo17986q();
    }

    public String getHeaderField(int i) {
        return this.f17263a.mo17987r(i);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.f17263a.mo17989t(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.f17263a.mo17991u(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.f17263a.mo17992v(i);
    }

    public long getHeaderFieldLong(String str, long j) {
        return this.f17263a.mo17993w(str, j);
    }

    public Map getHeaderFields() {
        return this.f17263a.mo17994x();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f17264b.getHostnameVerifier();
    }

    public long getIfModifiedSince() {
        return this.f17263a.mo17995y();
    }

    public InputStream getInputStream() {
        return this.f17263a.mo17996z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f17263a.mo17941A();
    }

    public long getLastModified() {
        return this.f17263a.mo17942B();
    }

    public Certificate[] getLocalCertificates() {
        return this.f17264b.getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.f17264b.getLocalPrincipal();
    }

    public OutputStream getOutputStream() {
        return this.f17263a.mo17943C();
    }

    public Principal getPeerPrincipal() {
        return this.f17264b.getPeerPrincipal();
    }

    public Permission getPermission() {
        return this.f17263a.mo17944D();
    }

    public int getReadTimeout() {
        return this.f17263a.mo17945E();
    }

    public String getRequestMethod() {
        return this.f17263a.mo17946F();
    }

    public Map getRequestProperties() {
        return this.f17263a.mo17947G();
    }

    public String getRequestProperty(String str) {
        return this.f17263a.mo17948H(str);
    }

    public int getResponseCode() {
        return this.f17263a.mo17949I();
    }

    public String getResponseMessage() {
        return this.f17263a.mo17950J();
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.f17264b.getSSLSocketFactory();
    }

    public Certificate[] getServerCertificates() {
        return this.f17264b.getServerCertificates();
    }

    public URL getURL() {
        return this.f17263a.mo17951K();
    }

    public boolean getUseCaches() {
        return this.f17263a.mo17952L();
    }

    public int hashCode() {
        return this.f17263a.hashCode();
    }

    public void setAllowUserInteraction(boolean z) {
        this.f17263a.mo17953M(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.f17263a.mo17954N(i);
    }

    public void setConnectTimeout(int i) {
        this.f17263a.mo17955O(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.f17263a.mo17956P(z);
    }

    public void setDoInput(boolean z) {
        this.f17263a.mo17957Q(z);
    }

    public void setDoOutput(boolean z) {
        this.f17263a.mo17958R(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.f17263a.mo17959S(i);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f17264b.setHostnameVerifier(hostnameVerifier);
    }

    public void setIfModifiedSince(long j) {
        this.f17263a.mo17961U(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.f17263a.mo17962V(z);
    }

    public void setReadTimeout(int i) {
        this.f17263a.mo17963W(i);
    }

    public void setRequestMethod(String str) {
        this.f17263a.mo17964X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f17263a.mo17965Y(str, str2);
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f17264b.setSSLSocketFactory(sSLSocketFactory);
    }

    public void setUseCaches(boolean z) {
        this.f17263a.mo17966Z(z);
    }

    public String toString() {
        return this.f17263a.toString();
    }

    public boolean usingProxy() {
        return this.f17263a.mo17969b0();
    }

    public Object getContent(Class[] clsArr) {
        return this.f17263a.mo17975g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f17263a.mo17988s(str);
    }

    public void setFixedLengthStreamingMode(long j) {
        this.f17263a.mo17960T(j);
    }
}
