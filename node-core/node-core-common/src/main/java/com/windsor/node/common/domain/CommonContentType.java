/*
Copyright (c) 2009, The Environmental Council of the States (ECOS)
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

 * Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
 * Neither the name of the ECOS nor the names of its contributors may
   be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 */

package com.windsor.node.common.domain;

import java.io.Serializable;

public enum CommonContentType implements Serializable
{
    OTHER("OTHER"),XML("XML"),Flat("FLAT"),BIN("BIN"),ZIP("ZIP"),ODF("ODF");

    private static final long serialVersionUID = 1;
    private final String type;

    private CommonContentType(String type) {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    /**
     * This is necessary due to the mismatch of legacy values Flat and Bin being mixed case while the WSDL defines all upper case values
     * @param value
     */
    public static CommonContentType fromString(String value)
    {
        CommonContentType type = null;
        if(CommonContentType.Flat.getType().equalsIgnoreCase(value))
        {
            type = CommonContentType.Flat;
        }
        else if(CommonContentType.BIN.getType().equalsIgnoreCase(value))
        {
            type = CommonContentType.BIN;
        }
        else
        {
            type = CommonContentType.valueOf(value);
        }
        return type;
    }
}