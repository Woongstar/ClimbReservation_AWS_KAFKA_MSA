
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CenterCenterManager from "./components/listers/CenterCenterCards"
import CenterCenterDetail from "./components/listers/CenterCenterDetail"

import ReservationReservationManager from "./components/listers/ReservationReservationCards"
import ReservationReservationDetail from "./components/listers/ReservationReservationDetail"

import MessageMessageManager from "./components/listers/MessageMessageCards"
import MessageMessageDetail from "./components/listers/MessageMessageDetail"

import PaymentPaymentManager from "./components/listers/PaymentPaymentCards"
import PaymentPaymentDetail from "./components/listers/PaymentPaymentDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/centers/centers',
                name: 'CenterCenterManager',
                component: CenterCenterManager
            },
            {
                path: '/centers/centers/:id',
                name: 'CenterCenterDetail',
                component: CenterCenterDetail
            },

            {
                path: '/reservations/reservations',
                name: 'ReservationReservationManager',
                component: ReservationReservationManager
            },
            {
                path: '/reservations/reservations/:id',
                name: 'ReservationReservationDetail',
                component: ReservationReservationDetail
            },

            {
                path: '/messages/messages',
                name: 'MessageMessageManager',
                component: MessageMessageManager
            },
            {
                path: '/messages/messages/:id',
                name: 'MessageMessageDetail',
                component: MessageMessageDetail
            },

            {
                path: '/payments/payments',
                name: 'PaymentPaymentManager',
                component: PaymentPaymentManager
            },
            {
                path: '/payments/payments/:id',
                name: 'PaymentPaymentDetail',
                component: PaymentPaymentDetail
            },



    ]
})
