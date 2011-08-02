package quickfix.fix50.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class BidDescReqGrp extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = {  };
    private int[] componentGroups = { 398, };

    public BidDescReqGrp() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.NoBidDescriptors value) {
        setField(value);
    }

    public quickfix.field.NoBidDescriptors get(
        quickfix.field.NoBidDescriptors value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoBidDescriptors getNoBidDescriptors()
        throws FieldNotFound {
        quickfix.field.NoBidDescriptors value = new quickfix.field.NoBidDescriptors();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoBidDescriptors field) {
        return isSetField(field);
    }

    public boolean isSetNoBidDescriptors() {
        return isSetField(398);
    }

    public static class NoBidDescriptors extends Group {
        static final long serialVersionUID = 20050617;

        public NoBidDescriptors() {
            super(398, 399,
                new int[] {
                    399, 400, 401, 404, 441, 402, 403, 405, 406, 407, 408, 0
                });
        }

        public void set(quickfix.field.BidDescriptorType value) {
            setField(value);
        }

        public quickfix.field.BidDescriptorType get(
            quickfix.field.BidDescriptorType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.BidDescriptorType getBidDescriptorType()
            throws FieldNotFound {
            quickfix.field.BidDescriptorType value = new quickfix.field.BidDescriptorType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.BidDescriptorType field) {
            return isSetField(field);
        }

        public boolean isSetBidDescriptorType() {
            return isSetField(399);
        }

        public void set(quickfix.field.BidDescriptor value) {
            setField(value);
        }

        public quickfix.field.BidDescriptor get(
            quickfix.field.BidDescriptor value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.BidDescriptor getBidDescriptor()
            throws FieldNotFound {
            quickfix.field.BidDescriptor value = new quickfix.field.BidDescriptor();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.BidDescriptor field) {
            return isSetField(field);
        }

        public boolean isSetBidDescriptor() {
            return isSetField(400);
        }

        public void set(quickfix.field.SideValueInd value) {
            setField(value);
        }

        public quickfix.field.SideValueInd get(
            quickfix.field.SideValueInd value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SideValueInd getSideValueInd()
            throws FieldNotFound {
            quickfix.field.SideValueInd value = new quickfix.field.SideValueInd();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SideValueInd field) {
            return isSetField(field);
        }

        public boolean isSetSideValueInd() {
            return isSetField(401);
        }

        public void set(quickfix.field.LiquidityValue value) {
            setField(value);
        }

        public quickfix.field.LiquidityValue get(
            quickfix.field.LiquidityValue value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LiquidityValue getLiquidityValue()
            throws FieldNotFound {
            quickfix.field.LiquidityValue value = new quickfix.field.LiquidityValue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LiquidityValue field) {
            return isSetField(field);
        }

        public boolean isSetLiquidityValue() {
            return isSetField(404);
        }

        public void set(quickfix.field.LiquidityNumSecurities value) {
            setField(value);
        }

        public quickfix.field.LiquidityNumSecurities get(
            quickfix.field.LiquidityNumSecurities value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LiquidityNumSecurities getLiquidityNumSecurities()
            throws FieldNotFound {
            quickfix.field.LiquidityNumSecurities value = new quickfix.field.LiquidityNumSecurities();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LiquidityNumSecurities field) {
            return isSetField(field);
        }

        public boolean isSetLiquidityNumSecurities() {
            return isSetField(441);
        }

        public void set(quickfix.field.LiquidityPctLow value) {
            setField(value);
        }

        public quickfix.field.LiquidityPctLow get(
            quickfix.field.LiquidityPctLow value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LiquidityPctLow getLiquidityPctLow()
            throws FieldNotFound {
            quickfix.field.LiquidityPctLow value = new quickfix.field.LiquidityPctLow();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LiquidityPctLow field) {
            return isSetField(field);
        }

        public boolean isSetLiquidityPctLow() {
            return isSetField(402);
        }

        public void set(quickfix.field.LiquidityPctHigh value) {
            setField(value);
        }

        public quickfix.field.LiquidityPctHigh get(
            quickfix.field.LiquidityPctHigh value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.LiquidityPctHigh getLiquidityPctHigh()
            throws FieldNotFound {
            quickfix.field.LiquidityPctHigh value = new quickfix.field.LiquidityPctHigh();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.LiquidityPctHigh field) {
            return isSetField(field);
        }

        public boolean isSetLiquidityPctHigh() {
            return isSetField(403);
        }

        public void set(quickfix.field.EFPTrackingError value) {
            setField(value);
        }

        public quickfix.field.EFPTrackingError get(
            quickfix.field.EFPTrackingError value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.EFPTrackingError getEFPTrackingError()
            throws FieldNotFound {
            quickfix.field.EFPTrackingError value = new quickfix.field.EFPTrackingError();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.EFPTrackingError field) {
            return isSetField(field);
        }

        public boolean isSetEFPTrackingError() {
            return isSetField(405);
        }

        public void set(quickfix.field.FairValue value) {
            setField(value);
        }

        public quickfix.field.FairValue get(quickfix.field.FairValue value)
            throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.FairValue getFairValue()
            throws FieldNotFound {
            quickfix.field.FairValue value = new quickfix.field.FairValue();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.FairValue field) {
            return isSetField(field);
        }

        public boolean isSetFairValue() {
            return isSetField(406);
        }

        public void set(quickfix.field.OutsideIndexPct value) {
            setField(value);
        }

        public quickfix.field.OutsideIndexPct get(
            quickfix.field.OutsideIndexPct value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.OutsideIndexPct getOutsideIndexPct()
            throws FieldNotFound {
            quickfix.field.OutsideIndexPct value = new quickfix.field.OutsideIndexPct();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.OutsideIndexPct field) {
            return isSetField(field);
        }

        public boolean isSetOutsideIndexPct() {
            return isSetField(407);
        }

        public void set(quickfix.field.ValueOfFutures value) {
            setField(value);
        }

        public quickfix.field.ValueOfFutures get(
            quickfix.field.ValueOfFutures value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.ValueOfFutures getValueOfFutures()
            throws FieldNotFound {
            quickfix.field.ValueOfFutures value = new quickfix.field.ValueOfFutures();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.ValueOfFutures field) {
            return isSetField(field);
        }

        public boolean isSetValueOfFutures() {
            return isSetField(408);
        }
    }
}
