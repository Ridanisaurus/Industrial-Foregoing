package com.buuz135.industrial.config.machine.generator;

import com.buuz135.industrial.config.MachineCoreConfig;
import com.buuz135.industrial.config.MachineGeneratorConfig;
import com.hrznstudio.titanium.annotation.config.ConfigFile;
import com.hrznstudio.titanium.annotation.config.ConfigVal;

@ConfigFile.Child(MachineGeneratorConfig.class)
public class BiofuelGeneratorConfig {

    @ConfigVal(comment = "Burn Time in Ticks [20 Ticks per Second] - Default: [100 (5s)]")
    public static int getMaxProgress = 100;

    @ConfigVal(comment = "Amount of Power Produced per Tick - Default: [400FE]")
    public static int getPowerPerTick = 160;

    @ConfigVal(comment = "Max Stored Power [FE] - Default: [10000 FE]")
    public static int getMaxStoredPower = 1000000;

    @ConfigVal(comment = "Amount of FE/t extracted from the Biofuel Generator")
    public static int getExtractionRate = 500;

    @ConfigVal(comment = "Max Amount of Stored Fluid [Biofuel] - Default: [8000mB]")
    public static int getMaxBiofuelTankSize = 4000;
}
