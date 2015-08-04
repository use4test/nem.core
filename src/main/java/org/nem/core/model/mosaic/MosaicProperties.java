package org.nem.core.model.mosaic;

import org.nem.core.model.*;

import java.util.Collection;

/**
 * Interface for reading mosaic properties.
 */
public interface MosaicProperties {

	/**
	 * Gets the number of decimal places up to which the mosaic instance can be partitioned.
	 *
	 * @return The divisibility.
	 */
	int getDivisibility();

	/**
	 * Gets the initial supply.
	 *
	 * @return The supply.
	 */
	long getInitialSupply();

	/**
	 * Gets a value indicating whether or not the supply is mutable.
	 *
	 * @return true if the supply is mutable, false otherwise.
	 */
	boolean isSupplyMutable();

	/**
	 * Gets a value indicating whether or not the the mosaic can be transferred between accounts different from the creator.
	 *
	 * @return true if it can be transferred, false otherwise.
	 */
	boolean isTransferable();

	/**
	 * Gets a value indicating whether or not a mosaic transfer has an additional fee.
	 *
	 * @return true if a mosaic transfer has an additional fee, false otherwise.
	 */
	boolean hasTransferFee();

	/**
	 * Gets a value indicating whether or not the transfer fee should interpreted as absolute value.
	 * The absolute value is in smallest units of the transfer fee mosaic.
	 * Otherwise the fee is in percentile of the transferred quantity.
	 *
	 * @return true if the transfer fee should interpreted as absolute value, false otherwise.
	 */
	boolean isTransferFeeAbsolute();

	/**
	 * Gets the address of the transfer fee recipient. This will be the creator of the mosaic as for now.
	 *
	 * @return The address.
	 */
	Address getTransferFeeRecipient();

	/**
	 * Gets the mosaic transfer fee.
	 *
	 * @return The mosaic transfer fee.
	 */
	long getTransferFee();

	/**
	 * Gets a collection of all property entries in the map.
	 *
	 * @return The collection of entries.
	 */
	Collection<NemProperty> asCollection();
}