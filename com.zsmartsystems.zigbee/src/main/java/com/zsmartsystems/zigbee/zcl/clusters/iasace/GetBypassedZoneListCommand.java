/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.iasace;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;

/**
 * Get Bypassed Zone List Command value object class.
 * <p>
 * Provides IAS ACE clients with a way to retrieve the list of zones to be bypassed. This provides them with the ability
 * to provide greater local functionality (i.e., at the IAS ACE client) for users to modify the Bypassed Zone List and reduce
 * communications to the IAS ACE server when trying to arm the CIE security system.
 * <p>
 * Cluster: <b>IAS ACE</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the IAS ACE cluster.
 * <p>
 * The IAS ACE cluster defines an interface to the functionality of any Ancillary
 * Control Equipment of the IAS system. Using this cluster, a ZigBee enabled ACE
 * device can access a IAS CIE device and manipulate the IAS system, on behalf of a
 * level-2 user.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZclProtocolCodeGenerator", date = "2018-04-10T07:30:44Z")
public class GetBypassedZoneListCommand extends ZclCommand {
    /**
     * Default constructor.
     */
    public GetBypassedZoneListCommand() {
        genericCommand = false;
        clusterId = 1281;
        commandId = 8;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(29);
        builder.append("GetBypassedZoneListCommand [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
