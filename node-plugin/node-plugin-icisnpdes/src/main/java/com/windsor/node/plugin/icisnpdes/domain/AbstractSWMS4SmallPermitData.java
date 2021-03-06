package com.windsor.node.plugin.icisnpdes.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import com.windsor.node.plugin.icisnpdes.generated.SWMS4SmallPermit;

/**
 * Specifies how to access address and contact info for {@link SWMS4SmallPermit}
 * data.
 *
 */
@MappedSuperclass
public abstract class AbstractSWMS4SmallPermitData extends AbstractAddressContactEntity {

	/**
	 * Returns the {@link SWMS4SmallPermit} object. The generated class will
	 * override this method.
	 *
	 * @return the {@link SWMS4SmallPermit} object
	 */
	@Transient
	public abstract SWMS4SmallPermit getSWMS4SmallPermit();

	@Override
	@Transient
	public IAddressList getAddressList() {
		IAddressList list = null;
		final SWMS4SmallPermit permit = getSWMS4SmallPermit();
		if (permit != null) {
			list = permit.getStormWaterAddress();
		}
		return list;
	}

	@Override
	public void nullAddress() {
		final SWMS4SmallPermit permit = getSWMS4SmallPermit();
		if (permit != null) {
			permit.setStormWaterAddress(null);
		}
	}

	@Override
	@Transient
	public IContactList getContactList() {
		IContactList list = null;
		final SWMS4SmallPermit permit = getSWMS4SmallPermit();
		if (permit != null) {
			list = permit.getStormWaterContact();
		}
		return list;
	}

	@Override
	public void nullContact() {
		final SWMS4SmallPermit permit = getSWMS4SmallPermit();
		if (permit != null) {
			permit.setStormWaterContact(null);
		}
	}

}
