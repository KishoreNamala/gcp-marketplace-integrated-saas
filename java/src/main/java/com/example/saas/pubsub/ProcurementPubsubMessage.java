// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.example.saas.pubsub;

/** POJO for Procurement Cloud Pub/Sub messages. */
public class ProcurementPubsubMessage {
  private ProcurementEventType eventType;
  private AccountMessage account;
  private EntitlementMessage entitlement;

  /** */
  public void setEventType(ProcurementEventType eventType) {
      this.eventType = eventType;
  }

  /** */
  public ProcurementEventType getEventType() {
    return eventType;
  }

  /** */
  public void setAccount(AccountMessage account) {
    this.account = account;
  }

  /** */
  public AccountMessage getAccount() {
    return account;
  }

  /** */
  public void setEntitlement(EntitlementMessage entitlement) {
    this.entitlement = entitlement;
  }

  /** */
  public EntitlementMessage getEntitlement() {
    return entitlement;
  }

  /** */
  public static class AccountMessage {
    private String id;

    /** */
    public void setId(String id) {
      this.id = id;
    }

    /** */
    public String getId() {
      return id;
    }
  }

  /** */
  public static class EntitlementMessage {
    private String id;
    private String newPlan;

    /** */
    public void setId(String id) {
      this.id = id;
    }

    /** */
    public String getId() {
      return id;
    }

    /** */
    public void setNewPlan(String newPlan) {
      this.newPlan = newPlan;
    }

    /** */
    public String getNewPlan() {
      return newPlan;
    }
  }
}