package com.dev.user.ValueObject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Department {
        private Long departmentId;
        private String departmentName;
        private String departmentAddress;
        private Long departmentCode;

        public Department() {
        }

        public Department(Long departmentId, String departmentName, String departmentAddress, Long departmentCode) {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
            this.departmentAddress = departmentAddress;

            this.departmentCode = departmentCode;
        }

        public Long getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }

        public String getDepartmentAddress() {
            return departmentAddress;
        }

        public void setDepartmentAddress(String departmentAddress) {
            this.departmentAddress = departmentAddress;
        }

        public Long getDepartmentCode() {
            return departmentCode;
        }

        public void setDepartmentCode(Long departmentCode) {
            this.departmentCode = departmentCode;
        }



        @Override
        public String toString() {
            return "Department{" +
                    "departmentId=" + departmentId +
                    ", departmentName='" + departmentName + '\'' +
                    ", departmentAddress='" + departmentAddress + '\'' +
                    ", departmentCode=" + departmentCode +
                    '}';
        }
}
