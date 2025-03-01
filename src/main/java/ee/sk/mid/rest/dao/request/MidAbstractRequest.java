package ee.sk.mid.rest.dao.request;

/*-
 * #%L
 * Mobile ID sample Java client
 * %%
 * Copyright (C) 2018 - 2019 SK ID Solutions AS
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import jakarta.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class MidAbstractRequest {

    @NotNull
    private String relyingPartyUUID;

    @NotNull
    private String relyingPartyName;

    @NotNull
    public String getRelyingPartyUUID() {
        return relyingPartyUUID;
    }

    public void setRelyingPartyUUID(@NotNull String relyingPartyUUID) {
        this.relyingPartyUUID = relyingPartyUUID;
    }

    @NotNull
    public String getRelyingPartyName() {
        return relyingPartyName;
    }

    public void setRelyingPartyName(@NotNull String relyingPartyName) {
        this.relyingPartyName = relyingPartyName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("relyingPartyUUID", getRelyingPartyUUID())
            .append("relyingPartyName", getRelyingPartyName())
            .toString();
    }
}
