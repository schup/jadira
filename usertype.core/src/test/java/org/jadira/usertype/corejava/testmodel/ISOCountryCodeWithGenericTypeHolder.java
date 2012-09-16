/*
 *  Copyright 2010, 2011, 2012 Christopher Pheby
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jadira.usertype.corejava.testmodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.jadira.cdt.country.ISOCountryCode;
import org.jadira.usertype.corejava.GenericEnumUserType;

@Entity
@Table(name = "isoCountryCodeWithGeneric")
@TypeDef(name = "ISOCountryCodeWithGenericType", typeClass = GenericEnumUserType.class)
public class ISOCountryCodeWithGenericTypeHolder implements Serializable {

    private static final long serialVersionUID = -1674416082110551506L;

    @Id
    private long id;

    @Column
    private String name;

    @Column
    @Type(type = "ISOCountryCodeWithGenericType", parameters = { @Parameter(name="enumClass", value="org.jadira.cdt.country.ISOCountryCode"), @Parameter(name="identifierMethod", value="name"), @Parameter(name="valueOfMethod", value="valueOf") })
    private ISOCountryCode ISOCountryCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ISOCountryCode getISOCountryCode() {
        return ISOCountryCode;
    }

    public void setISOCountryCode(ISOCountryCode ISOCountryCode) {
        this.ISOCountryCode = ISOCountryCode;
    }
}
