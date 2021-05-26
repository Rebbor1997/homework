package com.company.lesson6.robot;

public class Robot implements IRobot {
        private IHead head;
        private IHand hand;
        private ILeg leg;

        public Robot(IHead head, IHand hand, ILeg leg) {
            this.head = head;
            this.hand = hand;
            this.leg = leg;
        }

        public Robot(ToshibaHead head, SonyHand hand, SamsungLeg toshibaHead){

        }

    public Robot(SamsungHead samsungHead, SonyHand sonyHand, ToshibaHead toshibaHead) {
    }
    public IHead getHead() {
        return head;
    }

    public void setHead(SonyHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(SonyHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(SamsungLeg leg) {
        this.leg = leg;
    }


        @Override
        public void action() {
            head.speek();
            hand.upHand();
            leg.step();
        }

        /**
         * Get the cost of a robot
         * @return int
         */
        @Override
        public int getPrice() {
            int price = head.getPrice() + hand.getPrice() + leg.getPrice();
            return price;
        }
    }