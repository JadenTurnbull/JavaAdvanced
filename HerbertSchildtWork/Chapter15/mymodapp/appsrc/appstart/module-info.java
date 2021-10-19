module appstart {
    // Requires the modules appfuncs and userfuncs.
    requires appfuncs;
    requires userfuncs;

    // appstart now uses BinFuncProvider.
    uses userfuncs.binaryfuncs.BinFuncProvider;
}