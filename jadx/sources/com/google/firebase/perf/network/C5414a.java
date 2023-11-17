package com.google.firebase.perf.network;

import com.google.firebase.perf.util.Timer;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;
import p147ka.C6851h;

/* renamed from: com.google.firebase.perf.network.a */
public final class C5414a extends HttpURLConnection {

    /* renamed from: a */
    private final C5416c f17262a;

    C5414a(HttpURLConnection httpURLConnection, Timer timer, C6851h hVar) {
        super(httpURLConnection.getURL());
        this.f17262a = new C5416c(httpURLConnection, timer, hVar);
    }

    public void addRequestProperty(String str, String str2) {
        this.f17262a.mo17967a(str, str2);
    }

    public void connect() {
        this.f17262a.mo17968b();
    }

    public void disconnect() {
        this.f17262a.mo17970c();
    }

    public boolean equals(Object obj) {
        return this.f17262a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f17262a.mo17971d();
    }

    public int getConnectTimeout() {
        return this.f17262a.mo17972e();
    }

    public Object getContent() {
        return this.f17262a.mo17974f();
    }

    public String getContentEncoding() {
        return this.f17262a.mo17976h();
    }

    public int getContentLength() {
        return this.f17262a.mo17978i();
    }

    public long getContentLengthLong() {
        return this.f17262a.mo17979j();
    }

    public String getContentType() {
        return this.f17262a.mo17980k();
    }

    public long getDate() {
        return this.f17262a.mo17981l();
    }

    public boolean getDefaultUseCaches() {
        return this.f17262a.mo17982m();
    }

    public boolean getDoInput() {
        return this.f17262a.mo17983n();
    }

    public boolean getDoOutput() {
        return this.f17262a.mo17984o();
    }

    public InputStream getErrorStream() {
        return this.f17262a.mo17985p();
    }

    public long getExpiration() {
        return this.f17262a.mo17986q();
    }

    public String getHeaderField(int i) {
        return this.f17262a.mo17987r(i);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.f17262a.mo17989t(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.f17262a.mo17991u(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.f17262a.mo17992v(i);
    }

    public long getHeaderFieldLong(String str, long j) {
        return this.f17262a.mo17993w(str, j);
    }

    public Map getHeaderFields() {
        return this.f17262a.mo17994x();
    }

    public long getIfModifiedSince() {
        return this.f17262a.mo17995y();
    }

    public InputStream getInputStream() {
        return this.f17262a.mo17996z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f17262a.mo17941A();
    }

    public long getLastModified() {
        return this.f17262a.mo17942B();
    }

    public OutputStream getOutputStream() {
        return this.f17262a.mo17943C();
    }

    public Permission getPermission() {
        return this.f17262a.mo17944D();
    }

    public int getReadTimeout() {
        return this.f17262a.mo17945E();
    }

    public String getRequestMethod() {
        return this.f17262a.mo17946F();
    }

    public Map getRequestProperties() {
        return this.f17262a.mo17947G();
    }

    public String getRequestProperty(String str) {
        return this.f17262a.mo17948H(str);
    }

    public int getResponseCode() {
        return this.f17262a.mo17949I();
    }

    public String getResponseMessage() {
        return this.f17262a.mo17950J();
    }

    public URL getURL() {
        return this.f17262a.mo17951K();
    }

    public boolean getUseCaches() {
        return this.f17262a.mo17952L();
    }

    public int hashCode() {
        return this.f17262a.hashCode();
    }

    public void setAllowUserInteraction(boolean z) {
        this.f17262a.mo17953M(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.f17262a.mo17954N(i);
    }

    public void setConnectTimeout(int i) {
        this.f17262a.mo17955O(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.f17262a.mo17956P(z);
    }

    public void setDoInput(boolean z) {
        this.f17262a.mo17957Q(z);
    }

    public void setDoOutput(boolean z) {
        this.f17262a.mo17958R(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.f17262a.mo17959S(i);
    }

    public void setIfModifiedSince(long j) {
        this.f17262a.mo17961U(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.f17262a.mo17962V(z);
    }

    public void setReadTimeout(int i) {
        this.f17262a.mo17963W(i);
    }

    public void setRequestMethod(String str) {
        this.f17262a.mo17964X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f17262a.mo17965Y(str, str2);
    }

    public void setUseCaches(boolean z) {
        this.f17262a.mo17966Z(z);
    }

    public String toString() {
        return this.f17262a.toString();
    }

    public boolean usingProxy() {
        return this.f17262a.mo17969b0();
    }

    public Object getContent(Class[] clsArr) {
        return this.f17262a.mo17975g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f17262a.mo17988s(str);
    }

    public void setFixedLengthStreamingMode(long j) {
        this.f17262a.mo17960T(j);
    }
}
