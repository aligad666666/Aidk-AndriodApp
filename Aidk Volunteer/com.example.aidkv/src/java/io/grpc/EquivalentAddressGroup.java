/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.SocketAddress
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class EquivalentAddressGroup {
    private final List<SocketAddress> addrs;
    private final Attributes attrs;
    private final int hashCode;

    public EquivalentAddressGroup(SocketAddress socketAddress) {
        this(socketAddress, Attributes.EMPTY);
    }

    public EquivalentAddressGroup(SocketAddress socketAddress, Attributes attributes) {
        this((List<SocketAddress>)Collections.singletonList((Object)socketAddress), attributes);
    }

    public EquivalentAddressGroup(List<SocketAddress> list) {
        this(list, Attributes.EMPTY);
    }

    public EquivalentAddressGroup(List<SocketAddress> list, Attributes attributes) {
        Preconditions.checkArgument((boolean)(true ^ list.isEmpty()), (Object)"addrs is empty");
        this.addrs = Collections.unmodifiableList((List)new ArrayList(list));
        this.attrs = (Attributes)Preconditions.checkNotNull((Object)attributes, (Object)"attrs");
        this.hashCode = this.addrs.hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof EquivalentAddressGroup)) {
            return false;
        }
        EquivalentAddressGroup equivalentAddressGroup = (EquivalentAddressGroup)object;
        if (this.addrs.size() != equivalentAddressGroup.addrs.size()) {
            return false;
        }
        for (int i = 0; i < this.addrs.size(); ++i) {
            if (((SocketAddress)this.addrs.get(i)).equals(equivalentAddressGroup.addrs.get(i))) continue;
            return false;
        }
        return this.attrs.equals(equivalentAddressGroup.attrs);
    }

    public List<SocketAddress> getAddresses() {
        return this.addrs;
    }

    public Attributes getAttributes() {
        return this.attrs;
    }

    public int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.addrs);
        stringBuilder.append("/");
        stringBuilder.append((Object)this.attrs);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

