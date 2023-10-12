class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeakIndex(mountainArr);
        int leftResult = binarySearchAscending(mountainArr, target, 0, peakIndex);
        if (leftResult != -1) {
            return leftResult;
        }
        int rightResult = binarySearchDescending(mountainArr, target, peakIndex + 1, mountainArr.length() - 1);

        return rightResult;
    }

    private int findPeakIndex(MountainArray mountainArr) {
        int left = 0, right = mountainArr.length() - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            int nextValue = mountainArr.get(mid + 1);

            if (midValue < nextValue) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private int binarySearchAscending(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private int binarySearchDescending(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
